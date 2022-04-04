package week09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerPayRoll {
	private static ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public CustomerPayRoll() {
		customers = new ArrayList<Customer>();
	}
	
	public ArrayList<Customer> getCustomers(){
		return CustomerPayRoll.customers;
	}
	
	public static ArrayList<Customer> inputCustomer(){
		   Scanner scanner = new Scanner(System.in);
	       while (true) {
	    	   
	           System.out.println("Enter customer name or stop to exit:");
	           String name = scanner.next();
	           if(name.equalsIgnoreCase("stop")) {
					break;
				}
	           
	           customers.add(new Customer(name));
	       }
	       
	       Collections.sort(customers);
	       scanner.close();
	       return customers;
	       
	}
	
	public static void main(String[] args) {
		
	       ArrayList<Customer> customers =inputCustomer();
	    	   System.out.println(customers);
	       
	   }
}

