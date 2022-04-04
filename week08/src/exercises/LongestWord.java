package exercises;
import java.io.*;
import java.util.Scanner;

public class LongestWord {
	public static void main(String args[]) {
		try {
			String longestWord="";
			
			Scanner scan = new Scanner(new FileReader("textFile3.txt"));
			
			while(scan.hasNextLine()) {
				String latest=scan.nextLine();
				
				if(latest.length()>longestWord.length()) {
					longestWord=latest;
				}
			}
			System.out.println("The longest word in the file is: " +longestWord);
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Cannot open file for reading");
		}
		catch (IOException e) {
			System.err.println("Problem with Scanner and FileReader " + e);
		} 
	}
}
