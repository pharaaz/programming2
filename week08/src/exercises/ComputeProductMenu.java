package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeProductMenu {
	private static Scanner scanner;
	public static void product() throws InputMismatchException{
		try {
		System.out.println("Enter first number:");
		int value1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int value2 = scanner.nextInt();
		System.out.println("Product is: "+(value1*value2));
		}
		catch(InputMismatchException e) {
			System.out.println("Error reading integer value");
			 scanner.next();
		}
		
	}
	public static void main(String args[]){
		scanner = new Scanner(System.in);
		int key = 2;
		System.out.println("Welcome to the calculator.");
		while( key!=4) {
			System.out.println("1. Compute product");
			System.out.println("2. quit");
			try {
				int input = scanner.nextInt();
				if(input == 1) {
					product();
				}
				else if(input==2) {
					key=4;
				}
				else {
					System.out.println("Invalid menu input. Please try again.");
				}
			}catch(InputMismatchException e) {
				System.out.println("Invalid menu input. Please try again.");
				 scanner.next();
			}		 
		}
		System.out.println("Goodbye!");
	}
}


