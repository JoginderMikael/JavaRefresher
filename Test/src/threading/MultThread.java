package threading;

class A implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("From A: " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
}

class B implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("From B: " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
}

public class MultThread {
	

	public static void main(String[] args) {
		Runnable threadA = new A();
		Runnable threadB = new B();
		
		Thread t1 = new Thread(threadA);
		Thread t2 = new Thread(threadB);

		t1.start();
		t2.start();

	}

}
