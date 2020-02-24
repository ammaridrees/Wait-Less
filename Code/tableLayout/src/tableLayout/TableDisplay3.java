package tableLayout;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TableDisplay3 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDisplay3 frame = new TableDisplay3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableDisplay3() {
		setBounds(100, 100, 450, 300);

	}

}
