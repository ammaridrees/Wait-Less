package menuDisplay;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loader extends Menu  implements ActionListener {
   protected JButton salmonButton,pizzaButton,lasagnaButton, steakButton,icecreamButton,cakeButton, milkshakeButton, donutButton;
   protected Label list;
   protected DefaultListModel<String> l1 = new DefaultListModel<>();
   protected JList listy;
   protected JTextField tf2;
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel controlPanel;
   private JLabel id,name,price,quantity;
   private static int count = 0;
   public static int rev = 0;
   Restaurant T1 = new Restaurant();
   Restaurant T2 = new Restaurant();
   Restaurant T3 = new Restaurant();
   Restaurant T4 = new Restaurant();
   Restaurant T5 = new Restaurant();
   Restaurant T6 = new Restaurant();
   //GridLayout experimentLayout = new GridLayout(0,2);
   ScrollPaneLayout experimentLayout = new ScrollPaneLayout();
    ResultSet rs;

    public Loader(){


    prepareGUI();
   }

   public static void main(String[] args){
      Loader  swingControlDemo = new Loader();
      swingControlDemo.showButtonDemo();

   }

   private void prepareGUI(){
      mainFrame = new JFrame("Insert a new food item!");
      mainFrame.setSize(700,400);
      mainFrame.setLayout(new GridLayout(3, 1));

	  mainFrame.getContentPane().setBackground(Color.MAGENTA);

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            mainFrame.setVisible(false);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.setVisible(true);
   }


   public void showButtonDemo(){
	   JPanel jp = new JPanel();
	    jp.setBounds(900,80,200,200);

	    Menu r = new Menu();
	    r.Items();
	    listy = new JList<>(l1);
        list = new Label();

        list.setText("hi");
		headerLabel.setText("Waitless Menu");
		headerLabel.setFont(new Font(null, Font.BOLD, 27));

        name = new JLabel("Entrees    Enter Table Number");
        tf2=new JTextField();
        tf2.setPreferredSize( new Dimension( 50, 24 ) );

        JButton p = new JButton("Submit");
        //tf2.getText();
        tf2.setSize(100,40);

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







      jp.add(name);
      jp.add(tf2);
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
      jp.add(p);



	  mainFrame.setLocationRelativeTo(null);
      mainFrame.setVisible(true);
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
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Salmon"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Salmon"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Salmon"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Salmon"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Salmon"));
        }
        else {
        	System.out.println("no");
        }


    }
	if ("Lasagna".equals(e.getActionCommand())) {
		String counter = tf2.getText();
		l1.addElement("Lasagna Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Lasagna") );
		values.add(MenuItems.get("Steak"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Lasagna"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Lasagna"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Lasagna"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Lasagna"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Lasagna"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Lasagna"));
        }
        else {
        	System.out.println("no");
        }

    }
	if ("Pizza".equals(e.getActionCommand())) {
		String counter = tf2.getText();
		l1.addElement("Pizza Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Pizza") );
		values.add(MenuItems.get("Pizza"));
        hm.put(tf2.getText(),values);
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Pizza"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Pizza"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Pizza"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Pizza"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Pizza"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Pizza"));
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
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Steak"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Steak"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Steak"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Steak"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Steak"));
        }
        else {
        	System.out.println("no");
        }

    }
	if ("Donut".equals(e.getActionCommand())) {
		String counter = tf2.getText();
		l1.addElement("Donut Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Donut") );
		values.add(MenuItems.get("Donut"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Donut"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Donut"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Donut"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Donut"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Donut"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Donut"));
        }
        else {
        	System.out.println("no");
        }
    }
	if ("Ice Cream".equals(e.getActionCommand())) {
		String counter = tf2.getText();
		l1.addElement("Ice Cream Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Ice Cream") );
		values.add(MenuItems.get("Ice Cream"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Ice Cream"));
        }
        else {
        	System.out.println("no");
        }
    }
	if ("Cake".equals(e.getActionCommand())) {
		String counter = tf2.getText();
		l1.addElement("Cake Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Cake") );
		values.add(MenuItems.get("Cake"));
        hm.put(tf2.getText(),values);
        System.out.println(tf2.getText());
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Cake"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Cake"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Cake"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Cake"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Cake"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Cake"));
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
		String counter = tf2.getText();
		l1.addElement("Milkshake Ordered by Table \"" + tf2.getText() + "\" Cost is $" + MenuItems.get("Milkshake") );
		values.add(MenuItems.get("Milkshake"));
        hm.put(tf2.getText(),values);
        System.out.println(hm.get("T1"));
        if(counter.equals("T1")) {
        	T1.setTotalCost(T1.getTotalCost()+MenuItems.get("Milkshake"));
        }
        if(counter.equals("T2")) {
        	T2.setTotalCost(T2.getTotalCost()+MenuItems.get("Milkshake"));
        }
        if(counter.equals("T3")) {
        	T3.setTotalCost(T3.getTotalCost()+MenuItems.get("Milkshake"));
        }
        if(counter.equals("T4")) {
        	T4.setTotalCost(T4.getTotalCost()+MenuItems.get("Milkshake"));
        }
        if(counter.equals("T5")) {
        	T5.setTotalCost(T5.getTotalCost()+MenuItems.get("Milkshake"));
        }
        if(counter.equals("T6")) {
        	T6.setTotalCost(T6.getTotalCost()+MenuItems.get("Milkshake"));
        }
        else {
        	System.out.println("no");
        }
    }

}
}
