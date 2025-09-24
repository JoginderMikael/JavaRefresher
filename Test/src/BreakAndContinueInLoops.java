
public class BreakAndContinueInLoops {

	public static void main(String[] args) {
		// break = break out of a loop (STOP)
		//continue = skip current iteration of a loop (SKIP)
		
		for (int i = 0; i < 10; i++) {
			
		//	Thread.sleep(1000);
			
			if (i == 5) {
				
				//break; STOPS when i ==5
				continue; // SKIPS 5th iteration and continues from 6th
			}
			
			System.out.print(i + "  ");
		}

	}

}
