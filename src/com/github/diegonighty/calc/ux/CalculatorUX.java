package com.github.diegonighty.calc.ux;

import com.github.diegonighty.calc.Settings;
import com.github.diegonighty.calc.operations.OperationType;
import com.github.diegonighty.calc.ux.component.ComponentFactory;

import javax.swing.*;

public class CalculatorUX extends JFrame {

	private final ComponentFactory componentFactory;
	private final JPanel panel = new JPanel();
	private final JTextField preview;

	public CalculatorUX(ComponentFactory componentFactory, JTextField preview) {
		super(Settings.APPLICATION_TITLE);

		this.componentFactory = componentFactory;
		this.preview = preview;
	}

	public void init() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Settings.PANEL_SIZE);

		createUIComponents();
		add(panel);
		setVisible(true);
	}

	private void createUIComponents() {
		panel.add(preview);

		for (int i = 1; i <= 9; i++) {
			panel.add(componentFactory.createNumberButton(i));
		}

		panel.add(componentFactory.createNumberButton(0));

		panel.add(componentFactory.createClearButton());

		for (OperationType operation : OperationType.MATHS()) {
			panel.add(componentFactory.createOperationButton(operation));
		}

		panel.add(componentFactory.createComputeButton());
	}
}