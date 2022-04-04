package exercises;

public class CustomerAccount {
	private String name;
	
	public CustomerAccount(String name)throws CustomerAccountNameCannotBeNull, CustomerAccountNameCannotBeEmpty{
		if(name==null) {
			throw new CustomerAccountNameCannotBeNull("Customer name cannot be null.");
		}
		else if(name.length()==0) {
			throw new CustomerAccountNameCannotBeEmpty("Customer name cannot be empty.");			
		}
		else {
			this.name=name;
		}
	}
	
	public String getName() {
		return name; 
	}

	public void setName(String name) throws CustomerAccountNameCannotBeNull, CustomerAccountNameCannotBeEmpty{
		if(name==null) {
			throw new CustomerAccountNameCannotBeNull("Customer name can't be null.");
		}
		else if(name.length()==0) {
			throw new CustomerAccountNameCannotBeEmpty("Customer name can't be empty.");			
		}
		else {
			this.name=name;
		}
	}
	
	public String toString() {
		return "The customer name is: " +this.name;
	}

}

