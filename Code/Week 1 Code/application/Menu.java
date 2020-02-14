package application;

import java.util.Hashtable;
public class Menu {
   public void Items() {
	   Hashtable<String, Integer> MenuItems = 
               new Hashtable<String, Integer>(); 
	   MenuItems.put( "Cheese Burger", 8);
	   MenuItems.put( "BlackBean Burger", 7);
	   MenuItems.put( "Gyros Sandwich", (int) 6.50);
	   MenuItems.put( "HotDog", 3);
	   MenuItems.put( "Chili Fries", 3);
	   MenuItems.put( "BabyBack Ribs", 15);
	   MenuItems.put( "Soda Can", (int) .75);
	   MenuItems.put( "Water Bottle", 1);
	   
	   System.out.println("hashTable: "
               + MenuItems.toString());
   }



}
