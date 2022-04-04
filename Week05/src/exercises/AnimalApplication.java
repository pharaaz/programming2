package exercises;
import java.util.Scanner;

public class AnimalApplication {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Animal arra[]= new Animal[4];
		int input=0;
		int initial =0;
		
		for(int k=0;k<4;k++ ) {
			
		System.out.println("\nType 1 to create a Dog Object or 2 to create a Cat object");
		input = scanner.nextInt();

		
		if(input == 1) {
			arra[initial]= new Dog();
		}
		else {
			arra[initial]= new Cat();
		}
		
		initial++;
		
		}
		
		int limit =0;
		
		while (limit <4){
			System.out.println("\nSelect an animal to feed by entering a number within the range: 0 to 4");
			System.out.println("0 " +arra[0]);
			System.out.println("1 " +arra[1]);
			System.out.println("2 " +arra[2]);
			System.out.println("3 " +arra[3]);
			
			limit = scanner.nextInt();
			
			if(limit == 0) {
			
			arra[0].feed();
			
			}
			
			if(limit == 1) {
				
				arra[1].feed();
				
				}
			if(limit == 2) {
				
				arra[2].feed();
				
				}
			if(limit == 3) {
				
				arra[3].feed();
				
				}
			
		}
		
		System.out.println("Input out of range, quitting.");
		
	}
}
