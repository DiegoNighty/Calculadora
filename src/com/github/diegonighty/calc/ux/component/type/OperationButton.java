package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;
import com.github.diegonighty.calc.operations.OperationType;

public class OperationButton extends CalculatorButton {

	private final OperationType operationType;

	public OperationButton(OperationType operationType) {
		this.operationType = operationType;
	}

	@Override
	public void execute(CalculatorData data) {
		data.addOperation(operationType);
	}
}
