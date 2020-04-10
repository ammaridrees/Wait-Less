
package application;

import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Random;
public class Menu {
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public PriorityQueue<Integer>Line = new PriorityQueue<Integer>();
   private int totalCost;
	
	public Menu() {
		
	}
   public void addCustomer( ) {
	   int arr[] = {1,2,3,4,5,6,7,8,9};
	   
	  for(int i = arr.length; i>= 0; i--  ) {
		  Random rn = new Random();
		  int random1 = rn.nextInt(10 - 1 + 1) + 1;
		  System.out.println(random1);
		  System.out.println("hello");
		  //Line.add(random1);
	  }
	  //System.out.println("hello");
   }
   
   public void PurchaseHistory() {
	   Hashtable<Integer, Integer>Purchases = new Hashtable<Integer, Integer>();
   }
   public void Items() {
	   Hashtable<String, Integer> MenuItems = 
               new Hashtable<String, Integer>(); 
	   MenuItems.put( "Steak", 30);
	   MenuItems.put( "Lasagna", 13);
	   MenuItems.put( "Pizza",  12);
	   MenuItems.put( "Salmon", 17);
	   MenuItems.put( "Cake", 5);
	   MenuItems.put( "Milkshake", 3);
	   MenuItems.put( "Donut", 3);
	   MenuItems.put( "Ice Cream", 6);
	   
	   System.out.println("hashTable: "
               + MenuItems.toString());
   }

   public void serveCustomer() {
	   //addCustomer(Line);
	   
   }
   public static void main(String args[]) { 
          Menu m = new Menu();
          //m.serveCustomer();
          m.addCustomer();
   
   
   }
   



}

