package tableLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Tabledisplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabledisplay frame = new Tabledisplay();
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
	public Tabledisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[440px][][][grow]", "[268px,grow]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 0 4 1,alignx left,aligny top");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.GRAY);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GRAY);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
							.addGap(58)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addGap(54)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(129))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
											.addGap(27)
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
									.addGap(9))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addGap(142)))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
									.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
								.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))))
		);
		
		JLabel lblTableEight = new JLabel("Table Eight");
		lblTableEight.setForeground(Color.WHITE);
		panel_8.add(lblTableEight);
		
		JLabel lblTableSeven = new JLabel("Table Seven");
		lblTableSeven.setForeground(Color.WHITE);
		panel_4.add(lblTableSeven);
		
		JLabel lblTableSix = new JLabel("Table Six");
		lblTableSix.setForeground(Color.WHITE);
		panel_3.add(lblTableSix);
		
		JLabel lblTableFive = new JLabel("Table Five");
		lblTableFive.setForeground(Color.WHITE);
		panel_7.add(lblTableFive);
		
		JLabel lblTableFour = new JLabel("Table Four");
		lblTableFour.setForeground(Color.WHITE);
		panel_2.add(lblTableFour);
		
		JLabel lblTableThree = new JLabel("Table Three");
		lblTableThree.setForeground(Color.WHITE);
		panel_5.add(lblTableThree);
		
		JLabel lblTableTwo = new JLabel("Table Two");
		lblTableTwo.setForeground(Color.WHITE);
		panel_1.add(lblTableTwo);
		
		JLabel lblTableOne = new JLabel("Table One");
		lblTableOne.setForeground(Color.WHITE);
		panel_6.add(lblTableOne);
		panel.setLayout(gl_panel);
	}
}
