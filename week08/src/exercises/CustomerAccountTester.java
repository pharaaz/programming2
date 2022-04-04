package exercises;

public class CustomerAccountTester {
	  public static void main(String[] args) {
		  
	        try {
	            CustomerAccount c1 = new CustomerAccount("Bob Duncan");
	            c1.setName(null);
	        }catch (CustomerAccountNameCannotBeNull e){
	            System.err.println(e.getMessage());
	        }
	        try {
	            CustomerAccount c2 = new CustomerAccount("Herr Mustermann");
	           c2.setName("");
	        }catch (CustomerAccountNameCannotBeEmpty e){
	            System.err.println(e.getMessage());
	        }
	    }
}
