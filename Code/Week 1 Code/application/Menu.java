import java.util.*;
public class Menu {
	public PriorityQueue<Integer>Line = new PriorityQueue<Integer>();

   public void addCustomer( PriorityQueue<Integer> line) {
	   int arr[] = {1,2,3,4,5,6,7,8,9};
	  for(int i = arr.length; i< 9; i--  ) {
		  Random rn = new Random();
		  int random1 = rn.nextInt(10 - 1 + 1) + 1;

	  }
   }
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
