package com.github.diegonighty.calc.ux.component;

import com.github.diegonighty.calc.Settings;
import com.github.diegonighty.calc.operations.OperationType;
import com.github.diegonighty.calc.ux.component.type.ClearButton;
import com.github.diegonighty.calc.ux.component.type.ComputeButton;
import com.github.diegonighty.calc.ux.component.type.NumberButton;
import com.github.diegonighty.calc.ux.component.type.OperationButton;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

public class ComponentFactory {

	private final List<MouseAdapter> listeners = new ArrayList<>();

	public JButton createNumberButton(int number) {
		return applyStylesToButton(new NumberButton(number), String.valueOf(number));
	}

	public JButton createOperationButton(OperationType type) {
		return applyStylesToButton(new OperationButton(type), type.toMath());
	}

	public JButton createClearButton() {
		return applyStylesToButton(new ClearButton(), "C");
	}

	public JButton createComputeButton() {
		return applyStylesToButton(new ComputeButton(), "=");
	}

	public JTextField createTextField() {
		JTextField textField = new JTextField(Settings.TEXT_COLUMNS);

		textField.setFont(Settings.FONT);
		textField.setBorder(Settings.BUTTON_BORDER);
		textField.setMargin(Settings.PREVIEW_MARGIN);
		textField.setText("0");
		textField.setMaximumSize(Settings.MAX_SIZE_PREVIEW);

		return textField;
	}

	private JButton applyStylesToButton(JButton button, String text) {
		button.setText(text);
		button.setPreferredSize(Settings.BUTTON_SIZE);
		button.setMargin(Settings.BUTTON_MARGIN);
		button.setBackground(Settings.BUTTON_COLOR);
		button.setBorder(Settings.BUTTON_BORDER);
		button.setFont(Settings.FONT);

		listeners.forEach(button::addMouseListener);

		return button;
	}

	public void addListener(MouseAdapter adapter) {
		listeners.add(adapter);
	}

}
