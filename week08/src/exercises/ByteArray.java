package exercises;
import java.io.*;

public class ByteArray {
	public static void main(String[] args) {
	FileOutputStream out;
	try {
		out = new FileOutputStream("myFile.bin");
		String content = "Howdy!";
		out.write(content.getBytes());
		out.close();
	} catch (FileNotFoundException e) {
		System.out.println("Error: Cannot open file for writing");
		} catch (IOException e) {
		System.out.println("Error: Cannot write to file");
		}
	}
}
