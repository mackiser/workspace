package diceRoller;

import java.util.Scanner;

public class diceRoller {

	/*-
	 * Author: Mac Kiser 
	 * Date: 9/17/15 
	 * Program: Rolls as many 6-sided dice as the user wants
	 */

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many dice would you like to roll? ");
		int diceRolled = keyboard.nextInt();

		for (int i = 0; i < diceRolled; i++) {
			System.out.println(Math.floor((Math.random() * 6) + 1));
		}

	}

}
