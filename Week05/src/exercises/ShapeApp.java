package exercises;
import java.util.Scanner;

public class ShapeApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int loopy = 1;
		int input=0;
		
		while(loopy <3) {
		System.out.println("\n1 Create a Circle Object \n2 Create a Rectangle object \n3 Stop");
		input = scanner.nextInt();
		
		if(input ==1)
		{
			Circle circle = new Circle(2.09282);
			System.out.println("The area of the circle is: " +circle.computeArea());
		}
		if(input == 2)
		{
			Rectangle rectangle = new Rectangle(4,8);
			System.out.println("The area of the rectangle is: " +rectangle.computeArea());
		}
		else if(input  == 3) {
			break;
		}
		
		}
	}

}
