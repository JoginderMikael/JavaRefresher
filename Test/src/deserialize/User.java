package deserialize;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * A default serial versionuid
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String password;
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
}
