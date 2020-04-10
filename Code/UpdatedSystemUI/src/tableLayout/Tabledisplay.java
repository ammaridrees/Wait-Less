package tableLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabledisplay extends JFrame {

	private JPanel contentPane;
	
	
	private Image img_menu = new ImageIcon(Tabledisplay.class.getResource("/resources/icons8-menu-64.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_tasks = new ImageIcon(Tabledisplay.class.getResource("/resources/icons8-task-64.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_stats = new ImageIcon(Tabledisplay.class.getResource("/resources/icons8-statistics-64.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_table = new ImageIcon(Tabledisplay.class.getResource("/resources/icons8-table-64.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

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
		setBackground(new Color(148, 0, 211));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1177, 551);
		//setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 0, 211));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel paneSidebar = new JPanel();
		paneSidebar.setBackground(new Color(153, 50, 204));
		paneSidebar.setBounds(0, 0, 278, 551);
		contentPane.add(paneSidebar);
		paneSidebar.setLayout(null);
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(153, 50, 204));
		paneMenu.setBounds(0, 153, 289, 84);
		paneSidebar.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(new Color(255, 255, 255));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Dialog", Font.BOLD, 24));
		lblMenu.setBounds(102, 23, 134, 43);
		paneMenu.add(lblMenu);
		
		JLabel lblMenuIcon = new JLabel("");
		lblMenuIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuIcon.setBounds(17, 4, 89, 72);
		lblMenuIcon.setIcon(new ImageIcon(img_menu));
		paneMenu.add(lblMenuIcon);
		
		JPanel paneTasks = new JPanel();
		paneTasks.setBackground(new Color(153, 50, 204));
		paneTasks.setBounds(0, 290, 289, 84);
		paneSidebar.add(paneTasks);
		paneTasks.setLayout(null);
		
		JLabel lblTasks = new JLabel("TASKS LIST");
		lblTasks.setForeground(new Color(255, 255, 255));
		lblTasks.setBounds(119, 18, 141, 41);
		lblTasks.setHorizontalAlignment(SwingConstants.CENTER);
		lblTasks.setFont(new Font("Dialog", Font.BOLD, 24));
		paneTasks.add(lblTasks);
		
	
		JLabel lblTasksIcon = new JLabel("");
		lblTasksIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTasksIcon.setBounds(6, 6, 89, 72);
		lblTasksIcon.setIcon(new ImageIcon(img_tasks));
		paneTasks.add(lblTasksIcon);
		
		
		JPanel paneStats = new JPanel();
		paneStats.setBackground(new Color(153, 50, 204));
		paneStats.setBounds(0, 438, 289, 84);
		paneSidebar.add(paneStats);
		paneStats.setLayout(null);
		
		JLabel lblStats = new JLabel("STATS SCREEN");
		lblStats.setForeground(new Color(255, 255, 255));
		lblStats.setHorizontalAlignment(SwingConstants.CENTER);
		lblStats.setFont(new Font("Dialog", Font.BOLD, 22));
		lblStats.setBounds(94, 6, 189, 72);
		paneStats.add(lblStats);
		
		JLabel lblStatsIcon = new JLabel("");
		lblStatsIcon.setBounds(6, 6, 89, 72);
		paneStats.add(lblStatsIcon);
		lblStatsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatsIcon.setIcon(new ImageIcon(img_tasks));
		lblStatsIcon.setIcon(new ImageIcon(img_stats));
		
		JLabel lblTitle = new JLabel("Waitless");
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 35));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(6, 6, 266, 142);
		paneSidebar.add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(148, 0, 211));
		panel.setBounds(281, 0, 890, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton tbl1Button = new JButton("Table 1");
		tbl1Button.setBackground(new Color(0, 0, 205));
		tbl1Button.setForeground(new Color(0, 0, 0));
		tbl1Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tbl1Button.setBounds(55, 37, 206, 185);
		panel.add(tbl1Button);
		
		JButton tbl2Button = new JButton("Table 2");
		tbl2Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl2Button.setHorizontalAlignment(SwingConstants.RIGHT);
		tbl2Button.setForeground(Color.BLACK);
		tbl2Button.setBackground(Color.CYAN);
		tbl2Button.setBounds(343, 37, 206, 185);
		panel.add(tbl2Button);
		
		JLabel lblTable2 = new JLabel("");
		lblTable2.setBounds(346, 75, 90, 90);
		tbl2Button.add(lblTable2);
		lblTable2.setIcon(new ImageIcon(img_table));
	
		
		JButton tbl3Button = new JButton("Table 3");
		tbl3Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl3Button.setHorizontalAlignment(SwingConstants.RIGHT);
		tbl3Button.setForeground(Color.BLACK);
		tbl3Button.setBackground(Color.CYAN);
		tbl3Button.setBounds(647, 37, 206, 185);
		panel.add(tbl3Button);
		
		JLabel lblTable3 = new JLabel("");
		lblTable3.setBounds(704, 75, 90, 90);
		tbl3Button.add(lblTable3);
		lblTable3.setIcon(new ImageIcon(img_table));
		tbl3Button.add(lblTable3);
		
		JButton tbl5Button = new JButton("Table 5");
		tbl5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tbl5Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl5Button.setHorizontalAlignment(SwingConstants.RIGHT);
		tbl5Button.setForeground(Color.BLACK);
		tbl5Button.setBackground(Color.CYAN);
		tbl5Button.setBounds(343, 296, 206, 185);
		panel.add(tbl5Button);
		
		JLabel lblTable5 = new JLabel("");
		lblTable5.setBounds(410, 332, 90, 90);
		tbl5Button.add(lblTable5);
		lblTable5.setIcon(new ImageIcon(img_table));
		tbl5Button.add(lblTable5);
		
		JButton tbl4Button = new JButton("Table 4");
		tbl4Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl4Button.setHorizontalAlignment(SwingConstants.RIGHT);
		tbl4Button.setForeground(Color.BLACK);
		tbl4Button.setBackground(Color.CYAN);
		tbl4Button.setBounds(55, 296, 206, 185);
		panel.add(tbl4Button);
		
		JLabel lblTable4 = new JLabel("");
		lblTable4.setBounds(95, 332, 90, 90);
		tbl4Button.add(lblTable4);
		lblTable4.setIcon(new ImageIcon(img_table));
		
		
		JButton tbl6Button = new JButton("Table 6");
		tbl6Button.setVerticalAlignment(SwingConstants.BOTTOM);
		tbl6Button.setHorizontalAlignment(SwingConstants.RIGHT);
		tbl6Button.setForeground(Color.BLACK);
		tbl6Button.setBackground(Color.CYAN);
		tbl6Button.setBounds(647, 296, 206, 185);
		panel.add(tbl6Button);
		
		JLabel lblTable6 = new JLabel("");
		lblTable6.setBounds(687, 343, 90, 90);
		tbl6Button.add(lblTable6);
		lblTable6.setIcon(new ImageIcon(img_table));
		
		JLabel lblTable1 = new JLabel("");
		tbl1Button.add(lblTable1);
		lblTable1.setBounds(84, 77, 147, 98);
		//panel.add(lblTable1);
		lblTable1.setIcon(new ImageIcon(img_table));
	}
}
