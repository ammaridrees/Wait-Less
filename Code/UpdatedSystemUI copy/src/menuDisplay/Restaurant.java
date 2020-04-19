package menuDisplay;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;

public class Restaurant  {
   private boolean isServed;
   private boolean isOccupied;

public boolean isOccupied() {
	return isOccupied;
}
public void setOccupied(boolean isOccupied) {
	this.isOccupied = isOccupied;
}
   Timer timer;
   public String partyMembers[];
   private int totalCost;
   private int partyNumber;
   //public Restaurant T1, T2, T3, T4, T5, T6;
   public PriorityQueue<Restaurant> pQueue = new PriorityQueue<Restaurant>();
   private List<Restaurant> getallUsers;
   List<Restaurant> users = getallUsers;
   Restaurant(){
	  // T1 = new Restaurant();
	   //T2 = new Restaurant();
	   //T3 = new Restaurant();
	   //T4 = new Restaurant();
   }
//public Restaurant[] getallUsers() {
	//Restaurant[] array = new Restaurant[] {T1,T2,T3,T4,T5,T6};
    // Fill array
    //return array;
//}
public int getPartyNumber() {
	return partyNumber;
}

public void setPartyNumber(int partyNumber) {
	this.partyNumber = partyNumber;
}

public int getTotalCost() {
	return totalCost;
}

public void setTotalCost(int i) {
	this.totalCost = i;
}

public boolean getServed() {
	return isServed;
}

public void setServed(boolean isServed) {
	this.isServed = isServed;
}
/*public void timeTables() {
	while(T1.getServed() == false) {
		int seconds = 5;
		timer = new Timer();
        timer.schedule(new Restaurant(), seconds*1000);
	}
}
public void serveCustomers() {
	T1.getTotalCost();
	Collections.sort(users);
	while(pQueue.size()==0 ){
		if(pQueue.peek() == T1) {
			pQueue.remove();
			T1.setServed(true);
		}
		else if(pQueue.peek()==T2) {
			pQueue.remove();
			T2.setServed(true);
		}
		else if(pQueue.peek() == T3) {
			pQueue.remove();
			T2.setServed(true);
		}
	}
}*/

//public Restaurant highestTotal(Restaurant list[]);




/*@Override
public int compareTo(Restaurant u) {
  if (getTotalCost() == null || u.getTotalCost() == null) {
    return 0;
  }
  return getTotalCost().compareTo(u.getTotalCost());
}
@Override
public void run() {
	// TODO Auto-generated method stub
	if(T1.getServed() == true) {
		timer.cancel();
	}
}*/

/*Collections.sort(users, new Comparator<Restaurant>() {
	  @Override
	  public int compare(Restaurant u1, Restaurant u2) {
	    return u1.getTotalCost().compareTo(u2.getTotalCost());
	  }
	});*/
public static void main(String args[]) {
    Restaurant T1 = new Restaurant();
    //m.serveCustomer();
    //m.addCustomer();
    //T1.setTotalCost(T1.getTotalCost()+5);
    //T5.setTotalCost(T5.getTotalCost()+6);
    //T5.setTotalCost(6)+5;
    System.out.println(T1.getTotalCost());
}











}
