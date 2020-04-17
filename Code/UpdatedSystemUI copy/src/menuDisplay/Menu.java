package menuDisplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
public class Menu {

	public PriorityQueue<Integer>Line = new PriorityQueue<Integer>();
	public Hashtable<String, Integer> MenuItems =
             new Hashtable<String, Integer>();
	Map<String, List<Integer>> hm = new HashMap<String, List<Integer>>();
	List<Integer> values = new ArrayList<Integer>();
   private int totalCost;

	public Menu() {

	   MenuItems.put( "Steak", 30);
	   MenuItems.put( "Lasagna", 13);
	   MenuItems.put( "Pizza",  12);
	   MenuItems.put( "Salmon", 17);
	   MenuItems.put( "Cake", 5);
	   MenuItems.put( "Milkshake", 3);
	   MenuItems.put( "Donut", 3);
	   MenuItems.put( "Ice Cream", 6);
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
   public void setTablePrices() {
	   Set< Map.Entry< String,List<Integer>> > st = hm.entrySet();
	   for (Map.Entry< String,List<Integer>> me:st)
       {
           System.out.print(me.getKey()+":");
           System.out.println(me.getValue());
       }
   }
   public void Items() {



	   System.out.println("hashTable: "
               + MenuItems.toString());
   }

   public void serveCustomer() {
	   //addCustomer(Line);

   }
   public static void main(String args[]) {
          Menu m = new Menu();
          //m.serveCustomer();
          //m.addCustomer();
          m.setTablePrices();

   }




}
