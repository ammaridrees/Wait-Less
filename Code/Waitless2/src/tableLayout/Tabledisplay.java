package tableLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import statsDisplay.StatDisplay;
import tasksList.Main;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Tabledisplay extends JFrame implements ActionListener{

	private JPanel contentPane;
	protected JButton lblTableOne,lblTableTwo,lblTableThree,lblTableFour,lblTableFive,lblTableSix, lblTableSeven, lblTableEight;
    public PriorityQueue<Integer>peopleList = new PriorityQueue<Integer>();
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
		setBounds(100, 100, 801, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[440px][][][grow]", "[268px,grow]"));
		
		JButton statsButton = new JButton("StatsScreen");
		statsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatDisplay display = new StatDisplay();
				StatDisplay.main(null);
			}
		});
		
		JButton tasksButton = new JButton("TasksList");
		tasksButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main display = new Main();
				Main.main(null);
			}
		});
		contentPane.add(tasksButton, "flowx,cell 0 0");
		contentPane.add(statsButton, "cell 0 0");
		
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
		
		lblTableEight = new JButton("Table Eight");
		lblTableEight.setActionCommand("Eight");
		//lblTableEight.setForeground(Color.WHITE);
		panel_8.add(lblTableEight);
		
		lblTableSeven = new JButton("Table Seven");
		lblTableSeven.setActionCommand("Seven");
		//lblTableSeven.setForeground(Color.WHITE);
		panel_4.add(lblTableSeven);
		
		lblTableSix = new JButton("Table Six");
		lblTableSix.setActionCommand("Six");
		//lblTableSix.setForeground(Color.WHITE);
		panel_3.add(lblTableSix);
		
		lblTableFive = new JButton("Table Five");
		lblTableFive.setActionCommand("Five");
		//lblTableFive.setForeground(Color.WHITE);
		panel_7.add(lblTableFive);
		
		 lblTableFour = new JButton("Table Four");
		lblTableFour.setActionCommand("Four");
		//lblTableFour.setForeground(Color.WHITE);
		panel_2.add(lblTableFour);
		
		 lblTableThree = new JButton("Table Three");
		lblTableThree.setActionCommand("Three");
		//lblTableThree.setForeground(Color.WHITE);
		panel_5.add(lblTableThree);
		
		lblTableTwo = new JButton("Table Two");
		lblTableTwo.setActionCommand("Two");
		//lblTableTwo.setForeground(Color.WHITE);
		panel_1.add(lblTableTwo);
		
		lblTableOne = new JButton("Table One");
		lblTableOne.setActionCommand("One");
		//lblTableOne.setForeground(Color.WHITE);
		panel_6.add(lblTableOne);
		panel.setLayout(gl_panel);
		
	    lblTableOne.addActionListener(this);
	    lblTableTwo.addActionListener(this);
	    lblTableThree.addActionListener(this);
	    lblTableFour.addActionListener(this);
	    lblTableFive.addActionListener(this);
	    lblTableSix.addActionListener(this);
	    lblTableSeven.addActionListener(this);
	    lblTableEight.addActionListener(this);
	    
	    
	   
	   
		
	}
    public int NumberGenerator() {
    	List<Integer>list  = new ArrayList<>();
    	list.add(1);list.add(2);list.add(3);
    	
    	
    	int person = 0;
    	for(int i = list.size()-1; i >= 0; i-- ) {
    		int randomLocation = new Random().nextInt(list.size());
    	    person = list.remove(randomLocation);
    	    System.out.println(person);
    	    break;
    	}
    	return person;
    }
    public void PrintTableNames() {
    	System.out.println(peopleList.peek());
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if ("One".equals(e.getActionCommand())) {
			    peopleList.add(NumberGenerator());
			    
			    lblTableOne.setBackground(Color.RED);
		    	
		    	lblTableOne.setOpaque(true);
		    	lblTableOne.setBorderPainted(false);
		    	System.out.println("working");}
		 else if ("Two".equals(e.getActionCommand())) {
		 
			 lblTableTwo.setBackground(Color.RED);
		    	
		    	lblTableTwo.setOpaque(true);
		    	lblTableTwo.setBorderPainted(false);
		    	System.out.println("working");} 
		 else if ("Three".equals(e.getActionCommand())) {
			 lblTableThree.setBackground(Color.RED);
		    	
		    	lblTableThree.setOpaque(true);
		    	lblTableThree.setBorderPainted(false);
		    	System.out.println("working");} 
		 else if ("Four".equals(e.getActionCommand())) {
			 lblTableFour.setBackground(Color.RED);
		    	
		    	lblTableFour.setOpaque(true);
		    	lblTableFour.setBorderPainted(false);
		    	System.out.println("working");} 
		 else if ("Five".equals(e.getActionCommand())) {
			 lblTableFive.setBackground(Color.RED);
		    	
		    	lblTableFive.setOpaque(true);
		    	lblTableFive.setBorderPainted(false);
		    	System.out.println("working");} 
		 else if ("Six".equals(e.getActionCommand())) {
			 lblTableSix.setBackground(Color.RED);
		    	
		    	lblTableSix.setOpaque(true);
		    	lblTableSix.setBorderPainted(false);
		    	System.out.println("working");} 
		 else {
			 System.out.println("boo");
		 }
		 
	}
}