package com.github.diegonighty.calc.operations;

import com.github.diegonighty.calc.exception.OperationException;

public interface Computable {

	Number compute(Number number, Number number2) throws OperationException;

}
