package deserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * STEPS
		 * 1. Declare your object (don't instantiate)
		 * 2. Your class should implement serializable interfacer
		 * 3. add import.io.Serializable;
		 * 4. FileInputStream fileIn = new FileInputStream(file path)
		 * 5. ObjectInputStream in = new ObjectInputStream(fileIn)
		 * 6. objectNam = (class) in.readObject();
		 * in.close();
		 * fileIn.close();
		 * 
		 */

		User user = null; //(saying new User(); would instantiate the object.
		FileInputStream fileIn = new FileInputStream("userInfor.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		
		
		
	}

}
