package exercises;
import java.io.*;

public class ReadLineByLine {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("textFile.txt"));
			while(reader.ready()) {
				System.out.println(reader.readLine());
			}
			String contents = reader.readLine();
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Cannot open file for reading");
		}
		catch (IOException e) {
			System.out.println("Error: Cannot read from file");
		}
	}

}
