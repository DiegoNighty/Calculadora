package com.github.diegonighty.calc.operations;

public enum OperationType {

	NOTHING("?", false),
	ADD("+", true),
	DIVISION("/", true),
	MULTIPLICATION("*", true),
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

	public static OperationType[] MATHS() {
		return new OperationType[]{ADD, DIVISION, MULTIPLICATION, SUBTRACTION};
	}
}
