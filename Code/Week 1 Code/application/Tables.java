import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
public class Tables extends Menu{
	private int vertices;
	private LinkedList<Integer> list[];
	Tables(int amount){
		vertices = amount;
		list = new LinkedList[50];
		for(int i =0; i < vertices+1; i++) {
			list[i] = new LinkedList<Integer>();
		}
	}
	public void CustomersEntering() {
		Timer timer = new Timer();
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;

		while (elapsedTime < 2*60*1000) {

		   // elapsedTime = (new Date()).getTime() - startTime;
		   System.out.println("hello");
		}
	}
    public void PrintMenu(){

    }
    public void setLayout() {

    }
    void addTables(int x, int y) {
    	list[x].add(y);
    }

	public static void main(String[] args) {
		//System.out.println("hi");
		Tables myTable = new Tables(9);
		myTable.Items();
		//myTable.CustomersEntering();


	}

}
