package week09;
//import java.util.Collections;

public class Customer implements Comparable<Customer>{
	   private String name;
	   private int salary;
	  
	   public Customer(String name) {
			this.name=name;
		}
	  
	
	   public String getName() {
	       return this.name;
	   }

	   public int getSalary() {
	       return this.salary;
	   }

	   public int compareTo(Customer o) {
		   return this.name.compareTo(o.name);
	   }
	   
	   public String toString() {
			return this.name;
		}
}
