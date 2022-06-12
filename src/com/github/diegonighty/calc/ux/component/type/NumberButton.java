package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;

public class NumberButton extends CalculatorButton {

	private final int number;

	public NumberButton(int number) {
		this.number = number;
	}

	@Override
	public void execute(CalculatorData data) {
		data.addNumber(number);
	}
}
