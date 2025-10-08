package threading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		//Run this code on a separate thread.
		for (int i = 1; i <= 5; i++) {
			//access the thread class. Meaning the current thread (main thread)
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
			
			if (i == 5 ) {
				System.out.println("\nTimes Up");
				System.exit(0); //exit the program nonetheless
			}
		}
		
	}

}
