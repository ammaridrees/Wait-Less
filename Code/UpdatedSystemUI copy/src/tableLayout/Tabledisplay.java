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

//import net.miginfocom.swing.MigLayout;
import javafx.scene.control.Tab;
import statsDisplay.StatDisplay;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import menuDisplay.Loader;

//import com.sun.tools.javac.Main;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

import tasksList.Main;
import tasksList.Task;
import tasksList.User;


public class Tabledisplay extends JFrame implements ActionListener{

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
	  public static boolean isClicked1, isClicked2, isClicked3, isClicked4, isClicked5, isClicked6, isClicked7, isClicked8 = false;
	    public PriorityQueue<Integer> peopleList = new PriorityQueue<Integer>();
	    protected JButton tbl1Button1, tblButton2, tbl3Button, tbl4Button, tbl5Button, button_5, tblButton7, tblButton8;
	    private static int available = 6;
	    public static User newUser = new User("Bryan");
	    Check Timer1,Timer2,Timer3,Timer4,Timer5,Timer6;
	    public static int getAvailable() {
	        return available;
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
			
			JLabel lblMenuIcon = new JLabel("");
			lblMenuIcon.setHorizontalAlignment(SwingConstants.CENTER);
			lblMenuIcon.setBounds(17, 4, 89, 72);
			lblMenuIcon.setIcon(new ImageIcon(img_menu));
			paneMenu.add(lblMenuIcon);
			
			JButton btnMenu = new JButton("MENU");
			  btnMenu.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			    Loader display = new Loader();
			    Loader.main(null);
			   }
			  });
			btnMenu.setBackground(new Color(148, 0, 211));
			btnMenu.setBounds(112, 4, 152, 72);
			paneMenu.add(btnMenu);
			
			JPanel paneTasks = new JPanel();
			paneTasks.setBackground(new Color(153, 50, 204));
			paneTasks.setBounds(0, 290, 289, 84);
			paneSidebar.add(paneTasks);
			paneTasks.setLayout(null);
			
		
			JLabel lblTasksIcon = new JLabel("");
			lblTasksIcon.setHorizontalAlignment(SwingConstants.CENTER);
			lblTasksIcon.setBounds(6, 6, 89, 72);
			lblTasksIcon.setIcon(new ImageIcon(img_tasks));
			paneTasks.add(lblTasksIcon);
			
			JButton tasksButton = new JButton("TASKS LIST");
			  tasksButton.setBackground(new Color(148, 0, 211));
			  tasksButton.addActionListener(new ActionListener() {

			   public void actionPerformed(ActionEvent e) {
				   Thread thread = new Thread(){
					   public void run(){
						   Main display = new Main();
						   Main.main(null);
					   }
				   };

				   thread.start();
			   }
			  });
			tasksButton.setBounds(113, 6, 152, 72);
			paneTasks.add(tasksButton);
			
			
			JPanel paneStats = new JPanel();
			paneStats.setBackground(new Color(153, 50, 204));
			paneStats.setBounds(0, 438, 289, 84);
			paneSidebar.add(paneStats);
			paneStats.setLayout(null);
			
			JLabel lblStatsIcon = new JLabel("");
			lblStatsIcon.setBounds(6, 6, 89, 72);
			paneStats.add(lblStatsIcon);
			lblStatsIcon.setHorizontalAlignment(SwingConstants.CENTER);
			lblStatsIcon.setIcon(new ImageIcon(img_tasks));
			lblStatsIcon.setIcon(new ImageIcon(img_stats));
			
			JButton button = new JButton("STATS SCREEN");
			  button.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			    StatDisplay display = new StatDisplay();
			    StatDisplay.main(null);
			   }
			  });
			button.setBackground(new Color(148, 0, 211));
			button.setBounds(116, 6, 152, 72);
			paneStats.add(button);
			
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
			
			JLabel lblTable1 = new JLabel("");
			panel.add(lblTable1);
			lblTable1.setBounds(46, 110, 90, 90);
			//panel.add(lblTable1);
			lblTable1.setIcon(new ImageIcon(img_table));
			
			tbl1Button1 = new JButton("Table1");
			tbl1Button1.setActionCommand("One");
			tbl1Button1.setBackground(new Color(192, 192, 192));
			tbl1Button1.setOpaque(true);
			tbl1Button1.setBorderPainted(false);
			tbl1Button1.setBounds(132, 150, 117, 29);
			panel.add(tbl1Button1);
			
			JLabel lblTable2 = new JLabel("");
			panel.add(lblTable2);
			lblTable2.setBounds(356, 110, 90, 90);
			lblTable2.setIcon(new ImageIcon(img_table));
			
			tblButton2 = new JButton("Table2");
			tblButton2.setActionCommand("Two");
			/*tblButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});*/
			tblButton2.setOpaque(true);
			tblButton2.setBorderPainted(false);
			tblButton2.setBackground(Color.LIGHT_GRAY);
			tblButton2.setBounds(446, 150, 117, 29);
			panel.add(tblButton2);
			
			  tbl3Button = new JButton("Table3");
			  tbl3Button.setActionCommand("Three");
			/*tbl3Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});*/
			tbl3Button.setOpaque(true);
			tbl3Button.setBorderPainted(false);
			tbl3Button.setBackground(Color.LIGHT_GRAY);
			tbl3Button.setBounds(748, 150, 117, 29);
			panel.add(tbl3Button);
			
			JLabel label = new JLabel("");
			label.setBounds(654, 110, 90, 90);
			label.setIcon(new ImageIcon(img_table));
			panel.add(label);
			
			JLabel lblTable4 = new JLabel("");
			panel.add(lblTable4);
			lblTable4.setBounds(61, 318, 90, 90);
			lblTable4.setIcon(new ImageIcon(img_table));
			
			tbl4Button = new JButton("Table4");
			tbl4Button.setActionCommand("Four");
			/*tbl4Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});*/
			tbl4Button.setOpaque(true);
			tbl4Button.setBorderPainted(false);
			tbl4Button.setBackground(Color.LIGHT_GRAY);
			tbl4Button.setBounds(148, 353, 117, 29);
			panel.add(tbl4Button);
			
			JLabel lblTable5 = new JLabel("");
			panel.add(lblTable5);
			lblTable5.setBounds(356, 304, 90, 90);
			lblTable5.setIcon(new ImageIcon(img_table));
			
			tbl5Button = new JButton("Table5");
			tbl5Button.setActionCommand("Five");
			/*tbl5Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});*/
			tbl5Button.setOpaque(true);
			tbl5Button.setBorderPainted(false);
			tbl5Button.setBackground(Color.LIGHT_GRAY);
			tbl5Button.setBounds(446, 353, 117, 29);
			panel.add(tbl5Button);
			
			JLabel lblTable6 = new JLabel("");
			panel.add(lblTable6);
			lblTable6.setBounds(670, 304, 90, 90);
			lblTable6.setIcon(new ImageIcon(img_table));
			
			button_5 = new JButton("Table6");
			button_5.setActionCommand("Six");
			/*button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});*/
			button_5.setOpaque(true);
			button_5.setBorderPainted(false);
			button_5.setBackground(Color.LIGHT_GRAY);
			button_5.setBounds(767, 335, 117, 29);
			panel.add(button_5);
			
			
			tbl1Button1.addActionListener(this);
			tblButton2.addActionListener(this);
			tbl3Button.addActionListener(this);
			tbl4Button.addActionListener(this);
			tbl5Button.addActionListener(this);
			button_5.addActionListener(this);

			
			
		}

		@Override
		 public void actionPerformed(ActionEvent e) {
		        // TODO Auto-generated method stub
		        if ("One".equals(e.getActionCommand()) && !isClicked1) {
					Timer1 = new Check(120,"1");
		        	tbl1Button1.setBackground(Color.RED);
		        	tbl1Button1.setOpaque(true);
		        	tbl1Button1.setBorderPainted(false);
		            System.out.println("working");
		            available--;
		            isClicked1 = true;

		        }
				else if ("One".equals(e.getActionCommand()) && isClicked1) {
					Timer1.timer.cancel();
					tbl1Button1.setBackground(Color.LIGHT_GRAY);
					tbl1Button1.setOpaque(true);
					tbl1Button1.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked1 = false;

				}
				else if ("Two".equals(e.getActionCommand()) && !isClicked2) {
					Timer2 = new Check(60,"2");
					tblButton2.setBackground(Color.RED);
					tblButton2.setOpaque(true);
					tblButton2.setBorderPainted(false);
					System.out.println("working");
					available--;
					isClicked2 = true;
				}
				else if ("Two".equals(e.getActionCommand()) && isClicked2) {
					Timer2.timer.cancel();
					tblButton2.setBackground(Color.LIGHT_GRAY);
					tblButton2.setOpaque(true);
					tblButton2.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked2 = false;
				}
				else if ("Three".equals(e.getActionCommand()) && !isClicked3) {
					Timer3 = new Check(60,"3");
					tbl3Button.setBackground(Color.RED);
					tbl3Button.setOpaque(true);
					tbl3Button.setBorderPainted(false);
					System.out.println("working");
					available--;
					isClicked3 = true;
				}
				else if ("Three".equals(e.getActionCommand()) && isClicked3) {
					Timer3.timer.cancel();
					tbl3Button.setBackground(Color.LIGHT_GRAY);
					tbl3Button.setOpaque(true);
					tbl3Button.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked3 = false;
				}
				else if ("Four".equals(e.getActionCommand()) && !isClicked4) {
					Timer4 = new Check(180,"4");
					tbl4Button.setBackground(Color.RED);
					tbl4Button.setOpaque(true);
					tbl4Button.setBorderPainted(false);
					System.out.println("working");
					available--;
					isClicked4 = true;
				}
				else if ("Four".equals(e.getActionCommand()) && isClicked4) {
					Timer4.timer.cancel();
					tbl4Button.setBackground(Color.LIGHT_GRAY);
					tbl4Button.setOpaque(true);
					tbl4Button.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked4 = false;
				}
				else if ("Five".equals(e.getActionCommand()) && !isClicked5) {
					Timer5 = new Check(60,"5");
					tbl5Button.setBackground(Color.RED);
					tbl5Button.setOpaque(true);
					tbl5Button.setBorderPainted(false);
					System.out.println("working");
					available--;
					isClicked5 = true;
				}
				else if ("Five".equals(e.getActionCommand()) && isClicked5) {
					Timer5.timer.cancel();
					tbl5Button.setBackground(Color.LIGHT_GRAY);
					tbl5Button.setOpaque(true);
					tbl5Button.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked5 = false;
				}
				else if ("Six".equals(e.getActionCommand()) && !isClicked6) {
					Timer6 = new Check(90,"6");
					button_5.setBackground(Color.RED);
					button_5.setOpaque(true);
					button_5.setBorderPainted(false);
					System.out.println("working");
					available--;
					isClicked6 = true;
				}
				else if ("Six".equals(e.getActionCommand()) && isClicked6) {
					Timer6.timer.cancel();
					button_5.setBackground(Color.LIGHT_GRAY);
					button_5.setOpaque(true);
					button_5.setBorderPainted(false);
					System.out.println("working");
					available++;
					isClicked6 = false;
				}
		 }

	class Check {
		Timer timer;
		public String tableN;
		public int second;
		public Check(int seconds, String tableNum) {
			timer = new Timer();
			timer.schedule(new CheckTable(), seconds * 1000);
			System.out.println("not working");
			tableN = tableNum;
			second = seconds;
		}
		class CheckTable extends TimerTask {

			public void run() {
				System.out.println("Check Table!");
				timer.cancel(); //Terminate the timer thread
				newUser.userQueue.add(new Task("Check Table" + tableN + "! Time is up"));
				new Check(second,tableN);
			}
		}
	}
	}
