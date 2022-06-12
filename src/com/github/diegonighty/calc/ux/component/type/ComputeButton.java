package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;
import com.github.diegonighty.calc.exception.OperationException;

public class ComputeButton extends CalculatorButton {
    @Override
    public void execute(CalculatorData data) {
        if (data.canCompute()) {

            try {
                data.compute();
            } catch (OperationException e) {

            }

        }
    }
}
