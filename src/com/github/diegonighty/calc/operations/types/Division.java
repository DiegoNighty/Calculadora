package com.github.diegonighty.calc.operations.types;

import com.github.diegonighty.calc.exception.OperationException;
import com.github.diegonighty.calc.operations.Computable;

public class Division implements Computable {
    @Override
    public Number compute(Number numerator, Number denominator) throws OperationException {

        if (denominator.doubleValue() == 0) {
			throw new OperationException("The division in zero is not defined");
        }

        return numerator.doubleValue() / denominator.doubleValue();
    }
}
