package tableLayout;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TableDisplay2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TableDisplay2() {
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		add(btnNewButton);

	}

}
