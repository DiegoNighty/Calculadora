package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;

public class ComputeButton extends CalculatorButton {
	@Override
	public void execute(CalculatorData data) {
		if (data.canCompute()) {
			data.compute();
		}
	}
}
