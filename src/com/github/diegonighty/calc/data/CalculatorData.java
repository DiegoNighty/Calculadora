package com.github.diegonighty.calc.data;

import com.github.diegonighty.calc.exception.OperationException;
import com.github.diegonighty.calc.operations.ComputationProvider;
import com.github.diegonighty.calc.operations.OperationType;

public class CalculatorData {

	private StringBuilder numberBuilder = new StringBuilder();

	private Number lastFullNumber = 0;

	private OperationType lastOperation = OperationType.NOTHING;

	private boolean previousFullNumber;

	public CalculatorData addNumber(int number) {
		numberBuilder.append(number);

		return this;
	}

	public CalculatorData addDot() {
		numberBuilder.append('.');
		return this;
	}

	public CalculatorData addOperation(OperationType type) throws OperationException {
		if (canCompute()) {
			compute();
		}

		lastFullNumber = convertBuilder();
		clearBuilder();

		lastOperation = type;
		previousFullNumber = true;

		return this;
	}

	public Number compute() throws OperationException {
		Number result = ComputationProvider.of(lastOperation)
				.compute(lastFullNumber, convertBuilder());

		clearAll();

		numberBuilder = new StringBuilder(result.toString());

		return result;
	}

	public boolean canCompute() {
		return lastOperation != OperationType.NOTHING && !numberBuilder.toString().isEmpty();
	}

	public void clearAll() {
		clearBuilder();

		lastOperation = OperationType.NOTHING;
		lastFullNumber = 0;
		previousFullNumber = false;
	}

	private void clearBuilder() {
		numberBuilder = new StringBuilder();
	}
	private double convertBuilder() {
		String number = numberBuilder.toString();
		return number.isEmpty() ? 0 : Double.parseDouble(number);
	}

	public String toText() {
		StringBuilder builder = new StringBuilder();

		if (previousFullNumber && lastOperation.canPreview()) builder
				.append(lastFullNumber).append(" ")
				.append(lastOperation.toMath()).append(" ");

		builder.append(convertBuilder());

		return builder.toString();
	}

	@Override
	public String toString() {
		return "numberBuilder = " + numberBuilder.toString() + "\n" +
				"last full number = " + lastFullNumber + "\n" +
				"last operation = " + lastOperation.toMath() + "\n" +
				"computable? " + canCompute() + "\n";
	}
}
