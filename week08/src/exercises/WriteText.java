package exercises;
import java.io.*;

public class WriteText {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("textFile3.txt"));
			out.println("Hello");
			out.println("ben");
			out.println("yellow");
			out.println("orange");
			out.println("golden");
			out.println("black");
			out.println("white");
			out.println("tiger");
			out.println("kiwiana");
			out.println("indego");
			out.println("naruto");
			
			//out.println("Faraaz Khan!");
			//out.println("How are you?");
			
			out.close();
		} catch (IOException e) {
			System.out.println("Error: Cannot write to file");
		}
	}
}
