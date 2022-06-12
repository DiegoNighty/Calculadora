package com.github.diegonighty.calc.operations;

import com.github.diegonighty.calc.operations.types.Adder;
import com.github.diegonighty.calc.operations.types.Division;
import com.github.diegonighty.calc.operations.types.Multiplication;
import com.github.diegonighty.calc.operations.types.Pow;
import com.github.diegonighty.calc.operations.types.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class ComputationProvider {

	private final static Map<OperationType, Computable> OPERATIONS = new HashMap<>();

	static {
		OPERATIONS.put(OperationType.ADD, new Adder());
		OPERATIONS.put(OperationType.DIVISION, new Division());
		OPERATIONS.put(OperationType.SUBTRACTION, new Subtraction());
		OPERATIONS.put(OperationType.MULTIPLICATION, new Multiplication());
		OPERATIONS.put(OperationType.POW, new Pow());
	}

	public static Computable of(OperationType type) {
		return OPERATIONS.get(type);
	}

}
