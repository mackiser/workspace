package changeCounter;

import java.util.Scanner;

/*
* Author: Mac Kiser
* Date: 9/17/15
* Program counts thr amount of coins the user has and outputs it as dollars
*/

public class changeCounter {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		double quarters;
		double dimes;
		double nickels;
		double pennies;

		System.out.print("How many quarters do you have? ");
		quarters = keyboard.nextDouble();

		System.out.print("Dimes? ");
		dimes = keyboard.nextDouble();

		System.out.print("Nickels? ");
		nickels = keyboard.nextDouble();

		System.out.print("Pennies? ");
		pennies = keyboard.nextDouble();

		double quartersTotal = quarters * 0.25;
		double dimesTotal = dimes * 0.10;
		double nickelsTotal = nickels * 0.05;
		double penniesTotal = pennies * 0.01;

		double changeTotal = quartersTotal + dimesTotal + nickelsTotal + penniesTotal;

		System.out.printf("\nYou have $%.2f", changeTotal);

	}

}
