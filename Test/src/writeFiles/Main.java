package writeFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// HOW  to write a file using java (4 popular options)
		
		// FileWriter = Good for small or medium sized text files. 
		// BufferedWriter = Better performance for large amounts of text. 
		// FileOutputStream = Best for binary files. (e.g images, audio files)
		
		//FileWriter
		
		String filePath = "C:\\Users\\ADMIN\\Desktop\\test.txt";
		String textContent = """
				Roses are Red
				Violets are Blue
				BOOTY BOOTY BOOTY
				ROCKIN' EVERYWHERE!
				""";
		
		try (FileWriter writer = new FileWriter (filePath)) {
			writer.write(textContent);
			System.out.println("File has been written.");
		} catch(FileNotFoundException e) {
			System.out.println("Could not located file location");
		}
		
		catch (IOException e) {
			System.out.println("Could not write file.");
			//e.printStackTrace();
		}

	}

}
