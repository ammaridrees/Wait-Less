package tableLayout;


class Table { 
   public String name; 
   public double cost; 
         
   // A parameterized student constructor 
   public Table(String name, double cost) { 
     
       this.name = name; 
       this.cost = cost; 
   } 
     
   public String getName() { 
       return name; 
   }  
   public double getCost() {
	   return cost;
   }
} 
