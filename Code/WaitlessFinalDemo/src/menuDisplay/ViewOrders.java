package menuDisplay;



import javafx.application.Application;
import javafx.stage.Stage;
import statsDisplay.StatDisplay;
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

public class ViewOrders extends JFrame{

   protected Label list1, list2, list3, list4, list5, list6;
   protected DefaultListModel<String> lister = new DefaultListModel<>();
   protected DefaultListModel<String> lister1 = new DefaultListModel<>();
   protected DefaultListModel<String> lister2 = new DefaultListModel<>();
   protected DefaultListModel<String> lister3= new DefaultListModel<>();
   protected DefaultListModel<String> lister4 = new DefaultListModel<>();
   protected DefaultListModel<String> lister5 = new DefaultListModel<>();
   Menu mm = new Menu();

   protected JList listy1, listy2, listy3,listy4,listy5,listy6;
   protected JTextField tf2;

   private JLabel headerLabel;
   private JPanel controlPanel;

  

  // public void addItem(String item){
	//    this.items.add(item);
	 // }

  public ViewOrders(){
       //Loader l = new Loader();

	    //Restaurant t2 = (Restaurant)r.clone();
        JFrame f = new JFrame("View Orders");
        f.setBounds(1500,1500,1136,946);
    	JPanel jp = new JPanel();
    	jp.setBounds(225,69,800,811);
  	    f.getContentPane().setBackground(Color.ORANGE);

 	    jp.setBounds(225,80,50,50);

 	   lister.addElement("Table 1 Orders");
 	   lister1.addElement("Table 2 Orders");
 	   lister2.addElement("Table 3 Orders");
 	  lister3.addElement("Table 4 Orders");
 	 lister4.addElement("Table 5 Orders");
 	lister5.addElement("Table 6 Orders");
 	    listy1 = new JList<>(lister);
 	    listy2 = new JList<>(lister1);
 	    listy3 = new JList<>(lister2);
 	    listy4 = new JList<>(lister3);
 	    listy5 = new JList<>(lister4);
 	    listy6 = new JList<>(lister5);




 	  Loader.T1.items.forEach((n) -> lister.addElement(n));
 	  Loader.T2.items1.forEach((n) -> lister1.addElement(n));
 	  Loader.T3.items2.forEach((n) -> lister2.addElement(n));
 	  Loader.T4.items3.forEach((n) -> lister3.addElement(n));
 	  Loader.T5.items4.forEach((n) -> lister4.addElement(n));
 	  Loader.T6.items5.forEach((n) -> lister5.addElement(n));






       jp.add(listy1);
       jp.add(listy2);
       jp.add(listy3);
       jp.add(listy4);
       jp.add(listy5);
       jp.add(listy6);


       jp.setSize(800,800);


      f.getContentPane().add(jp);
 	 f.getContentPane().setLayout(null);
 	 f.setVisible(true);
   }



   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   ViewOrders frame = new ViewOrders();
                   frame.setVisible(true);
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
    
   }
}  









