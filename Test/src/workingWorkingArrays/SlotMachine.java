package workingWorkingArrays;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args) {
		// 	JAVA SLOT MACHINE
		
		
		// 	DECCLARE VARIABLES
		
		Scanner scanner = new Scanner(System.in);
		int balance = 100;
		int bet;
		int payout;
		String[] row;
		
		//	DISPLAY WELCOME MESSAGE
		System.out.println("==========================");
		System.out.println("  Welcome to JAVA SLOTS  ");
		System.out.println("Symbols: 🍋  ❤️  🍍  🍌  🍐");
		System.out.println("==========================");
		//	PLAY IF BALANCE > 0
		
		while(balance>0) {
			System.out.println("Current balance: $" + balance);
			//ENTER BET AMOUNT
			System.out.print("Place your  bet amount: " );
			bet = scanner.nextInt();
			
			//			VERIFY IF BET > BALANCE
			
			if(bet>balance) {
				System.out.println("INSUFFICIENT FUNDS IN YOUR ACCOUNT" );
				continue;
				//				VERIFY I BET > 0
			} else if(bet<=0) {
				System.out.println("BET MUST BE GREATOR THAN 0" );
			}else {
				//	 			SUBSTRAT BET FROM BALANCE
				balance -=bet;
				//System.out.println("Balance is $" + balance );
			}
			//			SPIN ROW
			
			
			System.out.println("Spinning ..." );
			spinRow();
		}
		
		
		
		
		

		// 	GET PAYOUT
		//	ASK TO PLAY AGAIN
		// 	DISPLAY EXIT MESSAGE

	scanner.close();
	}
	static String[] spinRow() {
		String[] symbols = {"🍋",  "❤️",  "🍍",  "🍌",  "🍐"};
		String[] row = new String[3];
		Random random = new Random();
		
		System.out.println(symbols[0]);
		return new String[0];
	}

}
