package tableLayout;

import java.util.Comparator;

class TableComparator implements Comparator<Table>{ 
    
    // Overriding compare()method of Comparator  
                // for descending order of cgpa 
    public int compare(Table t1, Table t2) { 
        if (t1.cost > t2.cost) 
            return 1; 
        else if (t1.cost < t2.cost) 
            return -1; 
                        return 0; 
        } 
} 