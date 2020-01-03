//Example for exception try block 

import java.io.*;

public class try_catch {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Pushkar\\eclipse-workspace\\Exception\\src\\abc.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("File has been loaded");
		}
		catch(FileNotFoundException e)
		{
			e.getMessage();
		}
			
	}
}
