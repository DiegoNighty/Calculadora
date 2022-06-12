package com.github.diegonighty.calc.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum OperationType {

	NOTHING("?", false),
	ADD("+", true),
	DIVISION("/", true),
	MULTIPLICATION("*", true),
	POW("^", true),
	SUBTRACTION("-", true);

	private final String math;
	private final boolean canPreview;
	OperationType(String math, boolean canPreview) {
		this.math = math;
		this.canPreview = canPreview;
	}

	public String toMath() {
		return math;
	}

	public boolean canPreview() {
		return canPreview;
	}

	public static List<OperationType> MATHS() {
		return Arrays.stream(values())
				.filter(operationType -> operationType.canPreview)
				.collect(Collectors.toList());
	}
}
