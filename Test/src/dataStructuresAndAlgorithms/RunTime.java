package dataStructuresAndAlgorithms;

public class RunTime {

	public static void main(String[] args) {
		/*
		 * Runtime of a program
		 */

		long startTime = System.nanoTime();
		
		//--------------program ---------
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//------------------------------
		
		Long duration = (System.nanoTime() - startTime)/1000000;
		
		System.out.println(duration + "ms");
	}

}
