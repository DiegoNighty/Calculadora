package com.github.diegonighty.calc.operations.types;

import com.github.diegonighty.calc.operations.Computable;

public class Adder implements Computable {
	@Override
	public Number compute(Number number, Number number2) {
		return number.doubleValue() + number2.doubleValue();
	}
}
