package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException {
		/*
		 * SERIALIZATION.
		 * This is the process of converting an object into a byte stream. 
		 * Persists (saves the sate) the object after program exits. 
		 * The byte stream can be saved as a file or sent over a network. 
		 * Can be sent to a different machine. 
		 * Byte stream can be saved as a file (.ser) which is platform independent. 
		 * (Think of this as a if you are saving a file with objects information)
		 * 
		 * 
		 * DESERIALIZATION
		 * The reverse process of converting a byte stream into an object. 
		 * (Think of this as if you are loading a saved file)
		 * 
		 * 
		 * STEPS TO SERIALIZA AN OBJECT
		 * 1. Your object class should implement serializable interface. 
		 * 2. Add import java.io.Serializable;
		 * 3. FileOutputStream fileOut = new FileOutputStream (file path)
		 * 4. ObjectOutputStream out = new OubjectOuputStream(fileOut)
		 * 5. out.writeOubject(objectName)
		 * 6. out.close(); fileOut.close();
		 * 
		 */

		User user = new User(); //instance
		user.name = "Joginder";
		user.password = "Mikael01";
		
		//user.sayHello();
		
		FileOutputStream fileOut = new FileOutputStream("userInfor.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved!");
	}

}
