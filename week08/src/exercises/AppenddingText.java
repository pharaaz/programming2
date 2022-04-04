package exercises;
import java.io.*;

public class AppenddingText {
	public static void main(String args[]) {
		try{PrintWriter out = new PrintWriter(new FileWriter("textFile2.txt",true));
		out.println("appending text into file");
		out.println("new stuff");
		out.println("testt");
		
		out.close();
	} catch (IOException e) {
		System.out.println("Error: Cannot write to file");
	}
				
		
	}
}
