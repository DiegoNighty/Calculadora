package com.github.diegonighty.calc;

import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

public class Settings {

	public static final String APPLICATION_TITLE = "Mi Calculadora";
	public static final Font FONT = new Font("Monospaced", Font.BOLD, 22);
	public static final Dimension BUTTON_SIZE = new Dimension(80, 80);
	public static final Dimension PANEL_SIZE = new Dimension(367, 425);

	public static final Insets BUTTON_MARGIN = new Insets(20, 20, 20,20);

	public static final Color BUTTON_COLOR = Color.WHITE;

	public static final Border BUTTON_BORDER = new SoftBevelBorder(5, Color.WHITE, Color.GRAY);

	public static final int TEXT_COLUMNS = 25;

	public static final Insets PREVIEW_MARGIN = new Insets(0, 51, 0, 50);

	public static final Dimension MAX_SIZE_PREVIEW = new Dimension(50, 50);

}
