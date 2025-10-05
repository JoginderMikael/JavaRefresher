package readingFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// How to read a file using java (3 popular options)
		
		//BufferredReader + FileReader: best for reading text line by line
		//FileInputStream: Best for library files(eg. images, audio files)
		//RandomAccessFile: best for read/write specific portions of a large file. 
		
		//BUFFERREDreader + FILEREADER
		String filePath = "C:\\Users\\ADMIN\\Desktop\\test.txt";
		
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			//System.out.println("The file exists");
			
			//reading the file
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file");
		} catch (IOException e) {
			System.out.println("Something went wrong");
		}

	}

}
