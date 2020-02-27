import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class StatDisplay extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatDisplay frame = new StatDisplay();
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
	public StatDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Object rowData[][] = {{"Tasks to Complete", "0"},
							  {"Tables Occupied", "0"},
							  {"Tables Open", "0"},
							  {"Customers Waiting", "0"},
							  {"Average Wait time", "0"}};
		
		Object columnNames[] = {"Column One", "Column Two"};
		
		table = new JTable(rowData, columnNames);
		
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setRowHeight(30);
		
		contentPane.add(table, BorderLayout.CENTER);
		
		JButton btnExit = new JButton("Exit");
		contentPane.add(btnExit, BorderLayout.SOUTH);
		btnExit.setPreferredSize(new Dimension(20, 40));
	}

}
