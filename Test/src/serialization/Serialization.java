package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
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
		 * NOTE
		 * -> Children classes of parent class that implements serializable will do so as well. 
		 * -> Static fields are not serializable (They belong to the class, not an individual object)
		 * -> The class's definition ("class file") itself is not recorded, cast it as the object type. 
		 * -> Fields declared as "Transient" aren't serialized, they're ignored. 
		 * -> SerialVersionUID is a unique version ID for a class that is serializable. 
		 * 
		 * SerialVersionUID => a unique ID that functions like a version number 
		 * -> It verifies that both the sender and the receiver of a serialized object loaded classes for that object that match. 
		 * -> Ensures that object will be compatible between machines. 
		 * -> Number must match. 
		 * -> Otherwise this will cause an InvalidClassException
		 * 
		 * -> It is calculated based on class properties, members, etc. 
		 * -> a serializable class can declare its own serialVersionUID explicitly (recommended).
		 * 
		 * 
		 * STEPS TO SERIALIZE AN OBJECT
		 * 1. Your object class should implement serializable interface. 
		 * 2. Add import java.io.Serializable;
		 * 3. FileOutputStream fileOut = new FileOutputStream (file path)
		 * 4. ObjectOutputStream out = new OubjectOuputStream(fileOut)
		 * 5. out.writeOubject(objectName)
		 * 6. out.close(); fileOut.close();
		 * 
		 */

		User user = new User(); //instance
		user.name = "Joginder Mikael";
		user.password = "Mikael01";
		
		//user.sayHello();
		
		FileOutputStream fileOut = new FileOutputStream("userInfor.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved!");
		
		//declaring serialization id
		ObjectStreamClass serialVersionUID = ObjectStreamClass.lookup(user.getClass());
		System.out.println(serialVersionUID);
	}

}
