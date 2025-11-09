package threading;

public class MultThread {
	

	public static void main(String[] args) {
		//Since runnable is a functional interface, we can use lambda expressions to define the run method.
		Runnable threadA = () -> {
			for (int i = 1; i <= 100; i++) {
				System.out.println("From A: " + i);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				
			}
		};
		
		Runnable threadB = () ->  {
			for (int i = 1; i <= 100; i++) {
				System.out.println("From B: " + i);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				
			}
		};
		
		Thread t1 = new Thread(threadA);
		Thread t2 = new Thread(threadB);

		t1.start();
		t2.start();

	}

}
