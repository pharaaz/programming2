package week09;

import java.util.HashMap;

public class AddressBook {
	HashMap<String,ContactDetail> contacts;
	
	public  AddressBook() {
		contacts = new HashMap<String,ContactDetail>();
	}
	
	public void store(ContactDetail info) {
		contacts.put(info.getLName() , info);
	}
	
	 public ContactDetail lookup(String lastname) {
	        for (String found : contacts.keySet()) {
	            if (found.contains(lastname)) {
	                return contacts.get(found);
	            }
	        }
	        return null;
	    }
}
