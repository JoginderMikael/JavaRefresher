import java.util.Scanner;

public class BankingProgram {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// JAVA BANKING PROGRAM FOR BEGINNERS
		
		// STEPS 
		// DECLARE VARIABLES
		// DISPLAY MENU
		// USER PICKS A CHOICE FROM MENU (GET AND PROCESS USERS CHOICE)
		// METHOD TO SHOWBALANCE. showBalance();
		// deposit() Method
		// withdraw() method
		//exit message
		
		
		
		double balance = 0;
		boolean isRunning = true;
		
		int choice;
		
		
		while(isRunning) {
			
			System.out.println("****************");
			System.out.println("BANKING PROGRAM");
			System.out.println("****************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("****************/n");
			
			System.out.print("Enter your choice (1-4): ");
			
			if (!scanner.hasNextInt()) {
				System.out.println("\nYou MUST enter an integer.");
				scanner.next();
			} else {
				choice = scanner.nextInt();
		
			switch(choice){
				case 1 -> {
					showBalance(balance);
					//isRunning = false;
					}
				case 2 -> {
					balance += deposite();
					System.out.printf("\nYour balance is $%.2f\n", balance);
					//isRunning = false;
				}
				case 3 -> {
					balance -= withdraw(balance);
					System.out.printf("\nYour updated balance is $%.2f\n", balance);
					//isRunning = false;
				}
				case 4 -> isRunning = false;
				default -> System.out.println("\nInvalid Choice. Enter value between 1 and 4.");
		}
		
			}
		}
		System.out.println("\n*************************");
		System.out.println("Thank you have a nice day");
		System.out.println("**************************");
		
		scanner.close();

	}
	
	static void showBalance(double balance) {
		System.out.printf("The balance in your account is $%.2f\n", balance);
	}
	static double deposite() {
		double amount;
		System.out.print("Enter Amount to be deposited: ");
		amount = scanner.nextDouble();
		
		if(amount < 0) {
			System.out.println("Amount can't be negative.");
			return 0;
		}else {
			return amount;
		}
		
		
		
	}
	
	static double withdraw(double balance) {
		
		double amount;
		System.out.print("Enter Amount to be withdrawn: ");
		amount = scanner.nextDouble();
		
		if(amount > balance) {
			System.out.println("INSUFFICIENT FUNDS IN YOUR ACCOUNT.");
			return 0;
		}else if (amount < 0){
			System.out.println("Amount to withdraw cant be negative.");
			return 0;
		} else {
			return amount;
		}
		
		
	}

}
