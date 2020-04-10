package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Menu implements ActionListener {
   protected JButton salmonButton,pizzaButton,lasagnaButton, steakButton,icecreamButton,cakeButton, milkshakeButton, donutButton;
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel controlPanel;
   private JLabel id,name,price,quantity;
   private static int count = 0;
   GridLayout experimentLayout = new GridLayout(0,2);
    ResultSet rs;

    Main(){


    prepareGUI();
   }

   public static void main(String[] args){
      Main  swingControlDemo = new Main();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Insert a new food item!");
      mainFrame.setSize(700,400);
      mainFrame.setLayout(new GridLayout(3, 1));
	  
	  mainFrame.getContentPane().setBackground(Color.CYAN);
	  
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

		headerLabel.setText("Waitless Menu");
		headerLabel.setFont(new Font(null, Font.BOLD, 27));

        name = new JLabel("Entrees");
        JTextField tf2=new JTextField();
        tf2.setSize(100,40);

        price = new JLabel("Dessert");
        JTextField tf3=new JTextField();
        tf3.setSize(100,40);

      
        salmonButton = new JButton("Salmon");
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
        

     


      JPanel jp = new JPanel(null);
      jp.add(name);
      jp.add(tf2);
      jp.add(lasagnaButton);
      jp.add(pizzaButton);
      jp.add(steakButton);
      jp.add(salmonButton);
      jp.add(price);
      jp.add(tf3);
      

      jp.setSize(800,800);
      jp.setLayout(experimentLayout);
      controlPanel.add(jp);
      jp.add(cakeButton);
      jp.add(milkshakeButton);
      jp.add(icecreamButton);
      jp.add(donutButton);
     
     
		

	  mainFrame.setLocationRelativeTo(null);
      mainFrame.setVisible(true);
   }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

