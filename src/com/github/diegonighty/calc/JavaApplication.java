package com.github.diegonighty.calc;

import com.github.diegonighty.calc.listener.ClickListener;
import com.github.diegonighty.calc.ux.CalculatorUX;
import com.github.diegonighty.calc.ux.component.ComponentFactory;

import javax.swing.*;

public class JavaApplication {

	public static void main(String[] args) {
		new JavaApplication().start();
	}

	public JavaApplication() {
		this.componentFactory = new ComponentFactory();
	}

	private final ComponentFactory componentFactory;

	public void start() {
		JTextField preview = componentFactory.createTextField();
		CalculatorUX calculatorUX = new CalculatorUX(componentFactory, preview);

		componentFactory.addListener(new ClickListener(preview));
		calculatorUX.init();
	}

}
