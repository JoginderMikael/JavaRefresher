package timerAndTimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// Timer => Class that schedules tasks at specific times or periodically. 
		// useful for: sending notifications, scheduling notifications, scheduled updates, repetitive actions. 
		
		//TimerTask. => represents the task that will be executed by the timer. 
		// you will extend the TimerTask class to define your task.
		// create a subclass of TimerTask and @Override run()
		
		

		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int count = 3;
			
			@Override
			public void run() {
				System.out.println("Hello!");
				count--;
				
				//stopping the action
				if (count <= 0) {
					System.out.println("TASK COMPLETE");
					timer.cancel();
				}
			}
		};
		
		//delay of 0 millisecond and do the task every 1000 milliseconds
		timer.schedule(task, 0, 1000);
	}

}
