package week09;
/*
 * 
 * USED FOR Exercise 3
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ContactDetails implements Comparable<ContactDetails> {
	private Relationship relationship;
	private String fName;
	private String lName;
	private String companyName;
	
	public ContactDetails(Relationship relationship, String fName, String lName, String companyName) {
		this.relationship=relationship;
		this.fName=fName;
		this.lName=lName;
		this.companyName=companyName;
	}
	
	public String getFname() {
		return this.fName;
	}
	public void setFName(String fName) {
		this.fName=fName;
	}
	
	public String getLName() {
		return this.lName;
	}
	public void setLName(String lName) {
		this.lName=lName;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	public Relationship getRelationship() {
		return this.relationship;
	}
	public void setRelationship(Relationship relationship) {
		this.relationship=relationship;
	}
	
	@Override
	public int compareTo(ContactDetails o) {
		return this.lName.compareTo(o.lName);
	}
	
	@Override
	public String toString() {
	       return "\nRelationship Type: " +relationship 
	    		   +", First Name:" +fName 
	    		   +", Last Name:" +lName
	    		   +", Company: " +companyName;
	   }
	
	public static void main(String[] args) {
		ArrayList<ContactDetails> contact = new ArrayList<ContactDetails>();
		Collections.addAll(contact, new ContactDetails(Relationship.FAMILY, "Itachi", "Uchiha", "Vodaphone"));
		Collections.addAll(contact, new ContactDetails(Relationship.COLLEAGUE, "Naruto", "Uzamaki", "Samsung"));
		Collections.addAll(contact, new ContactDetails(Relationship.FRIEND, "Josh", "Peck", "Nivia"));
		Collections.addAll(contact, new ContactDetails(Relationship.FAMILY, "Peter", "Parker", "IBM"));
		Collections.addAll(contact, new ContactDetails(Relationship.FAMILY, "Sasuke", "Uchiha", "Bostik"));
		
		System.out.println("Original");
		System.out.println(contact);
		Collections.sort(contact);
		System.out.println("Sort");
		System.out.println(contact);
		Collections.shuffle(contact);
		System.out.println("Shuffle");
		System.out.println(contact);
		System.out.println("Min");
		System.out.println(Collections.min(contact));
		System.out.println("Max");
		System.out.println(Collections.max(contact));
		
		Collections.sort(contact, compareByName());
		System.out.println("Sort by relationship");
		System.out.println(contact);		

	}
	
	static public Comparator<ContactDetails> compareByName(){
		return new Comparator<ContactDetails>(){
		@Override
		public int compare(ContactDetails o1, ContactDetails o2) {
		return o1.relationship.compareTo(o2.relationship);
		}
		};
		}

}
