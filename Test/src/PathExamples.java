import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExamples {

	public static void main(String[] args) {
		/*
		 * Paths in  Java can be represented using the java.nio.file.Path class.
		 * Here are some examples of how to create and manipulate paths:
		 * 1. Creating a Path:
		 *   Path path = Paths.get("C:/Users/Username/Documents/file.txt");
		 *   2. Getting the file name:
		 *   Path fileName = path.getFileName();
		 *   3. Getting the parent directory:
		 *   Path parent = path.getParent();
		 *   4. Resolving a subpath:
		 *   Path subPath = parent.resolve("subfolder/newfile.txt");
		 *   5. Normalizing a path:
		 *   Path normalizedPath = path.normalize();
		 *   6. Converting to absolute path:
		 *   Path absolutePath = path.toAbsolutePath();
		 *   7. Iterating over path elements:
		 *   for (Path element : path) {
		 *   System.out.println(element);
		 *   }
		 *   These examples demonstrate basic path manipulations in Java using the Path class.
		 */
		
		// Example: Creating a Path
		Path path = Paths.get("docs", "report.txt");
		
		System.out.println("The path " + path);
		// Example: Getting the file name
		Path fileName = path.getFileName();
		System.out.println("File Name: " + fileName);
	    // Example: Getting the parent directory
		Path parent = path.getParent();
		System.out.println("Parent Directory: " + parent);
		
		//creating directories for files. 
		Path dir = Paths.get("temp/data");
		Path fileInDir = dir.resolve("info.txt");
		
		//check if created file directory exists.
		if (Files.exists(fileInDir)) {
			//check if the directory first
			System.out.println("File exists at: " + fileInDir.toAbsolutePath());
		} else {
			//if not, create the directories and the file.
			try {
				Files.createDirectories(dir);
				Files.createFile(fileInDir);
				System.out.println("File created at: " + fileInDir.toAbsolutePath());
			} catch (Exception e) {
				e.printStackTrace();
			}
			//System.out.println("File creation failed.");
		}
		
	}

}
