import java.util.Scanner;

public class FuelVentingSystem {
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		// DECLARE VARIABLES
		//CREATE A METHOD TO PUMP if Liters entered 
		// Method to pump if amount entered
	
		double price = 3.5;
		int choice;
		boolean isRunning = true;
		
		
		
		while (isRunning) {
			
			System.out.println("\n====WELCOME TO THE FUEL PUMP===\n");
			System.out.println("1. Enter Litres of Fuel needed.");
			System.out.println("2. Enter Amount worth of fuel needed.");
			System.out.println("3. Exit Pump System.\n");
			System.out.print("Please Select an option: ");
			
			if (!scanner.hasNextInt()) {
			System.out.println("\nYOU MUST ENTER AN INTEGER \n");
			scanner.nextLine();
			
			} else {
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1 -> { 
			System.out.println("You have chosen to fuel in litres.");
			fuelInLitres(price);
			//isRunning = false; 
			}
		case 2 -> { 
			System.out.println("You have chosen to fuel in amount."); 
			fuelInAmount(price);
			
			}
		case 3 -> {
			System.out.println("You have Exited the Fueling System"); 
			isRunning = false;
		}
		default -> System.out.println("\nYOU MUST CHOOSE 1, 2 OR 3\n");
		}
		}
		
		}
		scanner.close();
	}
	
	static void fuelInLitres(double price) {
		double litres;
		System.out.print("Enter the # of litres you want to fill your tank with: ");
		
		while(!scanner.hasNextDouble()) {
			System.out.println("PLEASE ENTER NUMERIC VALUE.");
			scanner.next();
			
			System.out.print("Enter the # of litres you want to fill your tank with: ");
			
		}
		litres = scanner.nextDouble();
		System.out.println("Filling your tank with " + litres + " litres of fuel. Please wait .... ");
		
		try {
			
			if (litres <= 5 ) {
			Thread.sleep((long) (litres*1000));
			} else {
				Thread.sleep(5000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------");
		System.out.printf("Fueling complete, your bill is $%.2f\n", price*litres);
		System.out.println("----------------------------------------------------");
		
		//return 0;
	}
	
	static void fuelInAmount(double price) {
		double amount;
		double litres;
		
		System.out.print("Enter the amount in $ worth of fuel that you want to fill your tank: ");
		
		while (!scanner.hasNextDouble()) {
			System.out.println("PLEASE ENTER NUMERIC VALUE.");
			scanner.next();
			
			System.out.print("Enter the amount in $ worth of fuel that you want to fill your tank: ");
			}
		amount = scanner.nextDouble();
		System.out.println("Filling your tank with $" + amount + " worth of fuel. Please wait...");
		litres = amount/price;
		
		
		try {
			
			if (litres <= 5 ) {
				Thread.sleep((long) (litres*1000));
				} else {
					Thread.sleep(5000);
				}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("Fueling complete, your bill is $%.2f and you have fueled %.2f litres\n", amount, litres);
		System.out.println("----------------------------------------------------------------------------");
	}
	
	
	
}
