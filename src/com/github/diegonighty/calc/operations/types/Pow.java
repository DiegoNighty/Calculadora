package com.github.diegonighty.calc.operations.types;

import com.github.diegonighty.calc.operations.Computable;

public class Pow implements Computable {
	@Override
	public Number compute(Number number, Number number2) {
		return Math.pow(number.doubleValue(), number2.doubleValue());
	}
}
