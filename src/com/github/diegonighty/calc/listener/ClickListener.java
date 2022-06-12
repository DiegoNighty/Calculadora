package com.github.diegonighty.calc.listener;

import com.github.diegonighty.calc.data.CalculatorData;
import com.github.diegonighty.calc.ux.component.type.CalculatorButton;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseAdapter {

	private final static CalculatorData DATA = new CalculatorData();
	private final JTextField dataPreview;

	public ClickListener(JTextField dataPreview) {
		this.dataPreview = dataPreview;
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		if (!(event.getSource() instanceof CalculatorButton)) {
			return;
		}

		CalculatorButton button = (CalculatorButton) event.getSource();
		button.execute(DATA);

		dataPreview.setText(DATA.toText());
	}
}
