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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewOrders extends Loader{

   protected Label list1, list2, list3, list4, list5, list6;
   protected DefaultListModel<String> lister = new DefaultListModel<>();
   protected DefaultListModel<String> lister1 = new DefaultListModel<>();
   protected DefaultListModel<String> lister2 = new DefaultListModel<>();
   Menu mm = new Menu();

   protected JList listy1, listy2, listy3;
   protected JTextField tf2;

   private JLabel headerLabel;
   private JPanel controlPanel;


  // public void addItem(String item){
	//    this.items.add(item);
	 // }

   ViewOrders(){
       //Loader l = new Loader();

	    //Restaurant t2 = (Restaurant)r.clone();
        JFrame f = new JFrame("View Orders");
    	JPanel jp = new JPanel();
    	jp.setBounds(40,80,200,200);
  	    f.getContentPane().setBackground(Color.ORANGE);

 	    jp.setBounds(900,80,200,200);

 	   lister.addElement("Table 1 Orders");
 	  lister1.addElement("Table 2 Orders");
 	 lister2.addElement("Table 3 Orders");
 	    listy1 = new JList<>(lister);
 	    listy2 = new JList<>(lister1);
 	    listy3 = new JList<>(lister2);




 	   Loader.T1.items.forEach((n) -> lister.addElement(n));
 	  Loader.T2.items.forEach((n) -> lister1.addElement(n));





       jp.add(listy1);
       jp.add(listy2);
       jp.add(listy3);


       jp.setSize(800,800);


      f.add(jp);
 	 f.setLayout(null);
 	 f.setVisible(true);
   }




    public static void main(String[] args){
      new ViewOrders();

   }












}
