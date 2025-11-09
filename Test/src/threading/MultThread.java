package threading;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("From A: " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("From B: " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
}

public class MultThread {
	

	public static void main(String[] args) {
		A threadA = new A();
		B threadB = new B();

		threadA.start();
		threadB.start();

	}

}
