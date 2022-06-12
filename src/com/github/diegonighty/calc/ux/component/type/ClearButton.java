package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;

public class ClearButton extends CalculatorButton {
	@Override
	public void execute(CalculatorData data) {
		data.clearAll();
	}
}
