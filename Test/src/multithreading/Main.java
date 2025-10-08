package multithreading;

public class Main {

	public static void main(String[] args) {
		// Multithreading => enables a program to run multiple threads concurrently. 
		// (Thread => a set of instructions that run independently)
		//useful for background tasks or time consuming operations. 
		
		//MyRunnable myRunnable = new MyRunnable();
		Thread thread1 = new Thread(new MyRunnable("PING"));
		Thread thread2 = new Thread(new MyRunnable("PONG"));
		
		System.out.println("GAME START!");
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("GAME GAME OVER!");
	}

}
