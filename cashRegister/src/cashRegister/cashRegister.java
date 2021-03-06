package cashRegister;

import java.util.Scanner;

public class cashRegister {

	/*-
	 * Author: Mac Kiser 
	 * Date: 9/17/15 
	 * Program returns the amount of change the user should receive
	 -*/

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Total cost: ");
		double totalCost = keyboard.nextDouble();

		System.out.print("Amount paid: ");
		double amountPaid = keyboard.nextDouble();

		double changeBack = amountPaid - totalCost;

		System.out.printf("\nChange: %.2f", changeBack);
		System.out.println("");

		double twentiesBack = changeBack / 20;
		System.out.printf("\nTwenties: %.0f", Math.floor(twentiesBack));

		double tensBack = (changeBack % 20) / 10;
		System.out.printf("\nTens: %.0f", Math.floor(tensBack));

		double fivesBack = (changeBack % 10) / 5;
		System.out.printf("\nFives: %.0f", Math.floor(fivesBack));

		double onesBack = (changeBack % 5) / 1;
		System.out.printf("\nOnes: %.0f", Math.floor(onesBack));

		double quartersBack = (changeBack % 1) / 0.25;
		System.out.printf("\nQuarters: %.0f", Math.floor(quartersBack));

		double dimesBack = (changeBack % 0.25) / 0.10;
		System.out.printf("\nDimes: %.0f", Math.floor(dimesBack));

		double nickelsBack = (changeBack % 0.10) / 0.05;
		System.out.printf("\nNickels: %.0f", Math.floor(nickelsBack));

		double penniesBack = (changeBack % 0.05) / 0.01;
		System.out.printf("\nPennies: %.0f", penniesBack);

	}

}
