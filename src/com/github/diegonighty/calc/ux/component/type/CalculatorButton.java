package com.github.diegonighty.calc.ux.component.type;

import com.github.diegonighty.calc.data.CalculatorData;

import javax.swing.*;

public abstract class CalculatorButton extends JButton {

	public abstract void execute(CalculatorData data);

}
