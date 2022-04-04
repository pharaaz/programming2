package week09;
/*
 * 
 * USED FOR Exercise 5
 * 
 * 
 */

public class ContactDetail {
	private Relationship relationship;
	private String fName;
	private String lName;
	private String companyName;
	
	public ContactDetail(Relationship relationship, String fName, String lName, String companyName) {
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
}
	