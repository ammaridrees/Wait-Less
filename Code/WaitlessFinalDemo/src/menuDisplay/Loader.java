package menuDisplay;

import javafx.application.Application;
import javafx.stage.Stage;
import statsDisplay.StatDisplay;
import tableLayout.Tabledisplay;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.MatteBorder;

public class Loader extends Menu implements ActionListener {
   protected JButton salmonButton,pizzaButton,lasagnaButton, steakButton,icecreamButton,cakeButton, milkshakeButton, donutButton,p, delete;
   Menu mm = new Menu();
   //Thread thread = new Thread(new ViewOrders());
   protected Label list;
   protected DefaultListModel<String> l1 = new DefaultListModel<>();
   protected JList listy;
   protected JTextField tf2, tf3;
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel controlPanel;
   private JLabel id,name,price,quantity;
   private static int count = 0;
   ViewOrders v;
   boolean steakChecker = false;
   boolean salmonChecker = false;
   boolean pizzaChecker = false;
   boolean lasagnaChecker = false;
   boolean milkshakeChecker = false;
   boolean icecreamChecker = false;
   boolean donutChecker = false;
   boolean cakeChecker = false;
   public static Restaurant T1 = new Restaurant();
   public static Restaurant T2 = new Restaurant();
   public static Restaurant T3 = new Restaurant();
   public static Restaurant T4 = new Restaurant();
   public static Restaurant T5 = new Restaurant();
   public static Restaurant T6 = new Restaurant();
   //GridLayout experimentLayout = new GridLayout(0,2);
   ScrollPaneLayout experimentLayout = new ScrollPaneLayout();
    ResultSet rs;
    private JLabel lblEntrees;

    public Loader(){


    prepareGUI();
   }

   public static void main(String[] args){
      Loader  swingControlDemo = new Loader();
      swingControlDemo.showButtonDemo();

   }

   private void prepareGUI(){
      mainFrame = new JFrame("Insert a new food item!");
      mainFrame.setSize(1619,608);

	  mainFrame.getContentPane().setBackground(Color.PINK);

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            mainFrame.setVisible(false);
         }
      });

      controlPanel = new JPanel();
      controlPanel.setBackground(Color.PINK);
      controlPanel.setBounds(10, 94, 1500, 486);
      controlPanel.setLayout(new FlowLayout());
      mainFrame.getContentPane().setLayout(null);
      mainFrame.getContentPane().add(controlPanel);
      headerLabel = new JLabel("", JLabel.CENTER);
      headerLabel.setBounds(554, 49, 201, 33);
      mainFrame.getContentPane().add(headerLabel);
      headerLabel.setText("Waitless Menu");
      headerLabel.setFont(new Font(null, Font.BOLD, 27));

             p = new JButton("View Orders");
             p.setBounds(767, 58, 119, 29);
             mainFrame.getContentPane().add(p);
             p.setActionCommand("switch");
             p.addActionListener(this);

             delete = new JButton("Delete");
             delete.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
             delete.setBounds(1178, 59, 119, 29);
             mainFrame.getContentPane().add(delete);
             delete.setActionCommand("delete");
             delete.addActionListener(this);
             tf3=new JTextField();
             tf3.setLocation(1069, 51);
             tf3.setPreferredSize( new Dimension( 50, 24 ) );
                    //tf2.getText();
             tf3.setSize(100,40);
             //p.setBounds(900, 58, 119, 29);
             mainFrame.getContentPane().add(tf3);
      mainFrame.setVisible(true);
   }


   public void showButtonDemo(){

	    Menu r = new Menu();
	    r.Items();
        list = new Label();

        list.setText("hi");
      JPanel jp = new JPanel();
      jp.setBackground(Color.PINK);
      jp.setBounds(900,80,200,200);
      listy = new JList<>(l1);
      listy.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
      listy.setBackground(Color.WHITE);

              name = new JLabel("Enter Table Number");
              tf2=new JTextField();
              tf2.setPreferredSize( new Dimension( 50, 24 ) );

                             price = new JLabel("Dessert");
                             // JTextField tf3=new JTextField();
                              //tf3.setSize(100,40);


                              salmonButton = new JButton("Salmon");
                              salmonButton.setBackground(Color.YELLOW);
                              salmonButton.setActionCommand("Salmon");
                              pizzaButton = new JButton("Pizza");
                              pizzaButton.setActionCommand("Pizza");
                              lasagnaButton = new JButton("Lasagna");
                              lasagnaButton.setActionCommand("Lasagna");
                              steakButton = new JButton("Steak");
                              steakButton.setActionCommand("Steak");
                              cakeButton = new JButton("Cake");
                              cakeButton.setActionCommand("Cake");
                              milkshakeButton = new JButton("Milkshake");
                              milkshakeButton.setActionCommand("Milkshake");
                              icecreamButton = new JButton("Ice Cream");
                              icecreamButton.setActionCommand("Ice Cream");
                              donutButton = new JButton("Donut");
                              donutButton.setActionCommand("Donut");
                              salmonButton.addActionListener(this);
                              pizzaButton.addActionListener(this);
                              lasagnaButton.addActionListener(this);
                              steakButton.addActionListener(this);
                              cakeButton.addActionListener(this);
                              milkshakeButton.addActionListener(this);
                              icecreamButton.addActionListener(this);
                              donutButton.addActionListener(this);
                                    jp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));







                                    jp.add(name);
                                    jp.add(tf2);
                                    
                                    lblEntrees = new JLabel("Entrees");
                                    jp.add(lblEntrees);
                                    jp.add(lasagnaButton);
                                    jp.add(pizzaButton);
                                    jp.add(steakButton);
                                    jp.add(salmonButton);
                                    jp.add(price);
                                    //jp.add(tf3);


                                    jp.setSize(800,800);
                                    //jp.setLayout(experimentLayout);
                                    controlPanel.add(jp);
                                    jp.add(cakeButton);
                                    jp.add(milkshakeButton);
                                    jp.add(icecreamButton);
                                    jp.add(donutButton);
                                    jp.add(listy);



	  mainFrame.setLocationRelativeTo(null);
      mainFrame.setVisible(true);
   }
public void deleteItem(String tableName, String food) {
	String item = food;

	System.out.println(T1.items);
	if(tableName.contains("T1") && T1.items.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T1.items.remove(item);
		T1.setTotalCost(T1.getTotalCost()- MenuItems.get(item));}

	else if(tableName.contains("T2")&& T2.items1.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T2.items1.remove(item);
		T2.setTotalCost(T2.getTotalCost()- MenuItems.get(item));}
	else if(tableName.contains("T3")&& T3.items2.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T3.items2.remove(item);
		T3.setTotalCost(T3.getTotalCost()- MenuItems.get(item));}
	else if(tableName.contains("T4")&& T4.items3.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T4.items3.remove(item);
		T4.setTotalCost(T4.getTotalCost()- MenuItems.get(item));}
	else if(tableName.contains("T5")&& T5.items4.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T5.items4.remove(item);
		T5.setTotalCost(T5.getTotalCost()- MenuItems.get(item));}
	else if(tableName.contains("T6")&& T6.items5.contains(food)) {
		l1.addElement(item + " cancelled by Table  " + tableName );
		T6.items5.remove(item);
		T6.setTotalCost(T6.getTotalCost()- MenuItems.get(item));}
	else {
		l1.addElement("Error table hasn't ordered that item");
	}

    salmonChecker = false;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if ("Salmon".equals(e.getActionCommand())) {

		String counter = tf2.getText();
		l1.addElement("Salmon Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Salmon") );
		values.add(MenuItems.get("Salmon"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Salmon"));
        	T1.items.add("Salmon");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Salmon"));
        	T2.items1.add("Salmon");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Salmon"));
        	T3.items2.add("Salmon");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Salmon"));
        	T4.items3.add("Salmon");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Salmon"));
        	T5.items4.add("Salmon");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Salmon"));
        	T6.items5.add("Salmon");
        }
        else {
        	System.out.println("no");
        }


    }
	if ("Lasagna".equals(e.getActionCommand())) {
		lasagnaChecker = true;
		String counter = tf2.getText();
		l1.addElement("Lasagna Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Lasagna") );
		values.add(MenuItems.get("Steak"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Lasagna"));
        	T1.items.add("Lasagna");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Lasagna"));
        	T2.items1.add("Lasagna");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Lasagna"));
        	T3.items2.add("Lasagna");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Lasagna"));
        	T4.items3.add("Lasagna");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Lasagna"));
        	T5.items4.add("Lasagna");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Lasagna"));
        	T6.items5.add("Lasagna");
        }
        else {
        	System.out.println("no");
        }

    }
	if ("Pizza".equals(e.getActionCommand())) {
		pizzaChecker = true;
		String counter = tf2.getText();
		l1.addElement("Pizza Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Pizza") );
		values.add(MenuItems.get("Pizza"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Pizza"));
        	T1.items.add("Pizza");
        	//mm.a1.forEach((n) -> System.out.println(n));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Pizza"));
        	T2.items1.add("Pizza");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Pizza"));
        	T3.items2.add("Pizza");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Pizza"));
        	T4.items3.add("Pizza");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Pizza"));
        	T5.items4.add("Pizza");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Pizza"));
        	T6.items5.add("Pizza");
        }
        else {
        	System.out.println("no");
        }

    }
	if ("Steak".equals(e.getActionCommand())) {

		String counter = tf2.getText();
		l1.addElement("Steak Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Steak") );
		values.add(MenuItems.get("Steak"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Steak"));
        	T1.items.add("Steak");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Steak"));
        	T2.items1.add("Steak");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Steak"));
        	T3.items2.add("Steak");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Steak"));
        	T4.items3.add("Steak");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Steak"));
        	T5.items4.add("Steak");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Steak"));
        	T6.items5.add("Steak");
        }
        else {
        	System.out.println("no");
        }

    }
	if ("Donut".equals(e.getActionCommand())) {
		donutChecker = true;
		String counter = tf2.getText();
		l1.addElement("Donut Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Donut") );
		values.add(MenuItems.get("Donut"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Donut"));
        	T1.items.add("Donut");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Donut"));
        	T2.items1.add("Donut");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Donut"));
        	T3.items2.add("Donut");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Donut"));
        	T4.items3.add("Donut");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Donut"));
        	T5.items4.add("Donut");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Donut"));
        	T6.items5.add("Donut");
        }
        else {
        	System.out.println("no");
        }
    }
	if ("Ice Cream".equals(e.getActionCommand())) {
		icecreamChecker = true;
		String counter = tf2.getText();
		l1.addElement("Ice Cream Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Ice Cream") );
		values.add(MenuItems.get("Ice Cream"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Ice Cream"));
        	T1.items.add("Ice Cream");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Ice Cream"));
        	T2.items1.add("Ice Cream");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Ice Cream"));
        	T3.items2.add("Ice Cream");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Ice Cream"));
        	T4.items3.add("Ice Cream");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Ice Cream"));
        	T5.items4.add("Ice Cream");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Ice Cream"));
        	T6.items5.add("Ice Cream");
        }
        else {
        	System.out.println("no");
        }
    }
	if ("Cake".equals(e.getActionCommand())) {
		cakeChecker = true;
		String counter = tf2.getText();
		l1.addElement("Cake Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Cake") );
		values.add(MenuItems.get("Cake"));
        hm.put(tf2.getText(),values);
        System.out.println(tf2.getText());
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Cake"));
        	T1.items.add("Cake");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Cake"));
        	T2.items1.add("Cake");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Cake"));
        	T3.items2.add("Cake");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Cake"));
        	T4.items3.add("Cake");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Cake"));
        	T5.items4.add("Cake");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Cake"));
        	T6.items5.add("Cake");
        }
        else {
        	System.out.println("no");
        }
        //if(counter.equals("T1")) {
        //	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Cake"));
        	//T1.setTotalCost(T1.getTotalCost()+5);
        	//System.out.println(T1.getTotalCost());
        	//System.out.println("poo");
        //}

        //System.out.println(hm.get("T1"));
    }
	if ("Milkshake".equals(e.getActionCommand())) {
	    milkshakeChecker = true;
		String counter = tf2.getText();
		l1.addElement("Milkshake Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Milkshake") );
		values.add(MenuItems.get("Milkshake"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Milkshake"));
        	T1.items.add("Milkshake");
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Milkshake"));
        	T2.items1.add("Milkshake");
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Milkshake"));
        	T3.items2.add("Milkshake");
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Milkshake"));
        	T4.items3.add("Milkshake");
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Milkshake"));
        	T5.items4.add("Milkshake");
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Milkshake"));
        	T6.items5.add("Milkshake");
        }
        else {
        	System.out.println("no");
        }
    }
    if("delete".contentEquals(e.getActionCommand()) ) {
    	String counter = tf2.getText();
    	String counter2 = tf3.getText();
    	if(counter2.contains("Salmon") )  {
    		deleteItem(counter, counter2);

    		//salmonChecker = false;
    	}
       if(counter2.contains("Steak") )  {
    		deleteItem(counter, counter2);

    		//steakChecker = false;
    	}
       if(counter2.contains("Lasagna") )  {
    	   deleteItem(counter, counter2);

   		//steakChecker = false;
   	}
       if(counter2.contains("Pizza") )  {
    	   deleteItem(counter, counter2);

   		//steakChecker = false;
   	}
       if(counter2.contains("Cake") )  {
    	   deleteItem(counter, counter2);

   		//steakChecker = false;
   	}
       if(counter2.contains("Ice Cream") )  {
    	   deleteItem(counter, counter2);

   		//steakChecker = false;
   	}
       if(counter2.contains("Milkshake") )  {
    	   deleteItem(counter, counter2);

      		//steakChecker = false;
      	}
       if(counter2.contains("Donut") )  {
    	   deleteItem(counter, counter2);

      		//steakChecker = false;
      	}
}
	if("switch".equals(e.getActionCommand())) {
		//ViewOrders display = new ViewOrders();
		ViewOrders.main(null);
	}

}
}

