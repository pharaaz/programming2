package week09;

public class ContactDetailsTest {
	public static void main(String[] args) {
		
        ContactDetail p1=new ContactDetail(Relationship.FAMILY, "Itachi", "Minoto", "Vodaphone");
        ContactDetail p2=new ContactDetail(Relationship.COLLEAGUE, "Naruto", "Uzamaki", "Samsung");
        ContactDetail p3=new ContactDetail(Relationship.FRIEND, "Josh", "Peck", "Nivia");
        ContactDetail p4=new ContactDetail(Relationship.FAMILY, "Peter", "Parker", "IBM");
        ContactDetail p5=new ContactDetail(Relationship.FAMILY, "Sasuke", "Uchiha", "Bostik");
		
		AddressBook addressBook = new AddressBook();
		
		 addressBook.store(p1);
		 addressBook.store(p2);
		 addressBook.store(p3);
		 addressBook.store(p4);
		 addressBook.store(p5);
		
		 if (addressBook.lookup("Parker") == null) {
             System.out.println("Does not exist.");
         } 
		 else {
			 ContactDetail contact = addressBook.lookup("Parker");
			 
			 System.out.println("Found contact with last name " +contact.getLName() +" is");
             System.out.println("Relationship Type: " +contact.getRelationship()
             +", First Name: " +contact.getFname() 
             +", Last Name: " +contact.getLName()
             +", Company: " +contact.getCompanyName());

         }
		
	}
}		
