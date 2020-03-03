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

	private class table {
		boolean isClicked;
		table () {
			isClicked = false;
		}
	}
	
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
		setBounds(100, 100, 1231, 545);
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
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(104)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
									.addGap(113)
									.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
							.addGap(55)))
					.addGap(2)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(60)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
		);
		
		lblTableEight = new JButton("Table Eight");
		lblTableEight.setActionCommand("Eight");
		lblTableEight.setBackground(Color.GREEN);
    	lblTableEight.setOpaque(true);
    	lblTableEight.setBorderPainted(false);
		//lblTableEight.setForeground(Color.WHITE);
		panel_8.add(lblTableEight);
		
		textField_7 = new JTextField();
		panel_8.add(textField_7);
		textField_7.setColumns(10);
		
		lblTableSeven = new JButton("Table Seven");
		lblTableSeven.setActionCommand("Seven");
		lblTableSeven.setBackground(Color.GREEN);
    	lblTableSeven.setOpaque(true);
    	lblTableSeven.setBorderPainted(false);
		//lblTableSeven.setForeground(Color.WHITE);
		panel_4.add(lblTableSeven);
		
		textField_6 = new JTextField();
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		lblTableSix = new JButton("Table Six");
		lblTableSix.setActionCommand("Six");
		lblTableSix.setBackground(Color.GREEN);
    	lblTableSix.setOpaque(true);
    	lblTableSix.setBorderPainted(false);
		//lblTableSix.setForeground(Color.WHITE);
		panel_3.add(lblTableSix);
		
		textField_4 = new JTextField();
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		lblTableFive = new JButton("Table Five");
		lblTableFive.setActionCommand("Five");
		lblTableFive.setBackground(Color.GREEN);
    	lblTableFive.setOpaque(true);
    	lblTableFive.setBorderPainted(false);
		//lblTableFive.setForeground(Color.WHITE);
		panel_7.add(lblTableFive);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_7.add(textField_2);
		 
		  lblTableFour = new JButton("Table Four");
		  lblTableFour.setActionCommand("Four");
		  lblTableFour.setBackground(Color.GREEN);
		  lblTableFour.setOpaque(true);
		  lblTableFour.setBorderPainted(false);
		  //lblTableFour.setForeground(Color.WHITE);
		  panel_2.add(lblTableFour);
		  lblTableFour.addActionListener(this);
		 
		 textField_5 = new JTextField();
		 panel_2.add(textField_5);
		 textField_5.setColumns(10);
		
		lblTableThree = new JButton("Table Three");
		lblTableThree.setActionCommand("Three");
		lblTableThree.setBackground(Color.GREEN);
		lblTableThree.setOpaque(true);
		lblTableThree.setBorderPainted(false);
		//lblTableThree.setForeground(Color.WHITE);
		panel_5.add(lblTableThree);
		lblTableThree.addActionListener(this);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		lblTableTwo = new JButton("Table Two");
		lblTableTwo.setActionCommand("Two");
		lblTableTwo.setBackground(Color.GREEN);
    	lblTableTwo.setOpaque(true);
    	lblTableTwo.setBorderPainted(false);
		//lblTableTwo.setForeground(Color.WHITE);
		panel_1.add(lblTableTwo);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblTableOne = new JButton("Table One");
		lblTableOne.setActionCommand("One");
		lblTableOne.setBackground(Color.GREEN);
    	lblTableOne.setOpaque(true);
    	lblTableOne.setBorderPainted(false);
		//lblTableOne.setForeground(Color.WHITE);
		panel_6.add(lblTableOne);
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);
		panel.setLayout(gl_panel);
		
	    lblTableOne.addActionListener(this);
	    lblTableTwo.addActionListener(this);
	    lblTableFive.addActionListener(this);
	    lblTableSix.addActionListener(this);
	    lblTableSeven.addActionListener(this);
	    lblTableEight.addActionListener(this);
	    
	    table table1;
	    table table2;
	    table table3;
	   
	   
		
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
    private boolean isClicked = false; 
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    
    	
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if ("One".equals(e.getActionCommand()) && !table1.isClicked) {
			    peopleList.add(NumberGenerator());
			    
			    lblTableOne.setBackground(Color.RED);
		    	
		    	lblTableOne.setOpaque(true);
		    	lblTableOne.setBorderPainted(false);
		    	System.out.println("Table is in use");
		    	table1.isClicked = true;
		    	} 
			 else {
				 lblTableOne.setBackground(Color.GREEN);
			    	lblTableOne.setOpaque(true);
			    	lblTableOne.setBorderPainted(false);
			    	table1.isClicked = false;
			 }
		 if ("Two".equals(e.getActionCommand()) && !table2.isClicked) {
			    peopleList.add(NumberGenerator());
			    
			    lblTableTwo.setBackground(Color.RED);
		    	
		    	lblTableTwo.setOpaque(true);
		    	lblTableTwo.setBorderPainted(false);
		    	System.out.println("Table is in use");
		    	table2.isClicked = true;
		    	}
		 else {
			 lblTableTwo.setBackground(Color.GREEN);
		    	lblTableTwo.setOpaque(true);
		    	lblTableTwo.setBorderPainted(false);
		    	table2.isClicked = false;
		 }
		 if ("Three".equals(e.getActionCommand()) && !table3.isClicked) {
			 lblTableThree.setBackground(Color.RED);
		    	
		    	lblTableThree.setOpaque(true);
		    	lblTableThree.setBorderPainted(false);
		    	System.out.println("Table is in use");
		    	table3.isClicked = true;
		    	} 
		 else
		 {
			 	lblTableThree.setBackground(Color.GREEN);
		    	lblTableThree.setOpaque(true);
		    	lblTableThree.setBorderPainted(false);
		    	table3.isClicked = false;
		 }
		 if ("Four".equals(e.getActionCommand()) && !isClicked) {
			 lblTableFour.setBackground(Color.RED);
		    	
		    	lblTableFour.setOpaque(true);
		    	lblTableFour.setBorderPainted(false);
		    	System.out.println("Table is in use");} 
		 else
		 {
			 	lblTableFour.setBackground(Color.GREEN);
		    	lblTableFour.setOpaque(true);
		    	lblTableFour.setBorderPainted(false);
		    	//isClicked = !isClicked;
		 }
		 if ("Five".equals(e.getActionCommand()) && !isClicked) {
			 lblTableFive.setBackground(Color.RED);
		    	
		    	lblTableFive.setOpaque(true);
		    	lblTableFive.setBorderPainted(false);
		    	System.out.println("Table is in use");} 
		 else
		 {
			 	lblTableFive.setBackground(Color.GREEN);
		    	lblTableFive.setOpaque(true);
		    	lblTableFive.setBorderPainted(false);
		    	//isClicked = !isClicked;
		 }
		 if ("Six".equals(e.getActionCommand()) && !isClicked) {
			 lblTableSix.setBackground(Color.RED);
		    	
		    	lblTableSix.setOpaque(true);
		    	lblTableSix.setBorderPainted(false);
		    	System.out.println("Table is in use");} 
		 else
		 {
			 	lblTableSix.setBackground(Color.GREEN);
		    	lblTableSix.setOpaque(true);
		    	lblTableSix.setBorderPainted(false);
		    	//isClicked = !isClicked;
		 }
		// isClicked = !isClicked;
		 if ("Seven".equals(e.getActionCommand()) && !isClicked) {
			 lblTableSeven.setBackground(Color.RED);
		    	
		    	lblTableSeven.setOpaque(true);
		    	lblTableSeven.setBorderPainted(false);
		    	System.out.println("Table is in use");} 
		 else
		 {
			 	lblTableSeven.setBackground(Color.GREEN);
		    	lblTableSeven.setOpaque(true);
		    	lblTableSeven.setBorderPainted(false);
		    	//isClicked = !isClicked;
		 }
		// isClicked = !isClicked;
		 if ("Eight".equals(e.getActionCommand()) && !isClicked) {
			 lblTableEight.setBackground(Color.RED);
		    	
		    	lblTableEight.setOpaque(true);
		    	lblTableEight.setBorderPainted(false);
		    	System.out.println("Table is in use");} 
		 else
		 {
			 	lblTableEight.setBackground(Color.GREEN);
		    	lblTableEight.setOpaque(true);
		    	lblTableEight.setBorderPainted(false);
		    	//isClicked = !isClicked;
		 }
		isClicked = !isClicked;
	}	
		
}
