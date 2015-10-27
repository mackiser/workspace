import java.util.Scanner;
import java.util.Random;

/*-
 * Author: Mac Kiser
 * Date: 10/19/15
 * Program: 10 question quiz for elementary school level kids
 */

public class quiz {
	static Scanner keyboard = new Scanner(System.in);
	static int totalPoints = 0;

	// get random number with a minimum and maximum
	public static int getRandom(int minimum, int maximum) {
		int range = (maximum - minimum) + 1;
		return (int) (Math.random() * range) + minimum;
	}

	// generate addition problem
	public static void getAddition() {
		int num1 = getRandom(1, 99);
		int num2 = getRandom(1, 99);
		int key = num1 + num2;

		System.out.printf("%5d\n", num1);
		System.out.printf("+%4d\n", num2);
		System.out.println("------");
		System.out.printf("%5s\n\n", "?");

		System.out.print("Input your answer: ");
		int answer = keyboard.nextInt();
		if (answer == key) {
			System.out.println("Correct!\n");
			totalPoints += 10;
		} else {
			System.out.print("Try again: ");
			answer = keyboard.nextInt();
			if (answer == key) {
				System.out.println("Correct!\n");
				totalPoints += 5;
			} else {
				System.out.println("Incorrect.\n");
			}
		}
	}

	// generate subtraction problem
	public static void getSubtraction() {
		int num1 = getRandom(1, 99);
		int num2 = getRandom(1, 99);

		while (num2 > num1)
			num2 = getRandom(1, 99);

		int key = num1 - num2;

		System.out.printf("%5d\n", num1);
		System.out.printf("-%4d\n", num2);
		System.out.println("------");
		System.out.printf("%5s\n\n", "?");

		System.out.print("Input your answer: ");
		int answer = keyboard.nextInt();
		if (answer == key) {
			System.out.println("Correct!\n");
			totalPoints += 10;
		} else {
			System.out.print("Try again: ");
			answer = keyboard.nextInt();
			if (answer == key) {
				System.out.println("Correct!\n");
				totalPoints += 5;
			} else {
				System.out.println("Incorrect.\n");
			}
		}
	}

	// generate multiplication problem
	public static void getMultiplication() {
		int num1 = getRandom(1, 20);
		int num2 = getRandom(1, 10);
		int key = num1 * num2;

		System.out.printf("%5d\n", num1);
		System.out.printf("x%4d\n", num2);
		System.out.println("------");
		System.out.printf("%5s\n\n", "?");

		System.out.print("Input your answer: ");
		int answer = keyboard.nextInt();
		if (answer == key) {
			System.out.println("Correct!\n");
			totalPoints += 10;
		} else {
			System.out.print("Try again: ");
			answer = keyboard.nextInt();
			if (answer == key) {
				System.out.println("Correct!\n");
				totalPoints += 5;
			} else {
				System.out.println("Incorrect.\n");
			}
		}
	}

	// generate division problem
	public static void getDivision() {
		int num1 = getRandom(1, 99);
		int num2 = getRandom(1, 10);

		// make sure the numbers are divisible
		while (num1 % num2 != 0) {
			num2 = getRandom(1, 10);
		}

		int key = num1 / num2;

		System.out.printf("%4d\n", num1);
		System.out.println(" ---- = ?");
		System.out.printf("%4d\n\n", num2);

		System.out.print("Input your answer: ");
		int answer = keyboard.nextInt();
		if (answer == key) {
			System.out.println("Correct!\n");
			totalPoints += 10;
		} else {
			System.out.print("Try again: ");
			answer = keyboard.nextInt();
			if (answer == key) {
				System.out.println("Correct!\n");
				totalPoints += 5;
			} else {
				System.out.println("Incorrect.\n");
			}
		}
	}

	public static void main(String[] args) {

		// ask 10 questions
		for (int i = 0; i < 10; i++) {

			// get random operator for question
			int operator = getRandom(1, 4);

			if (operator == 1) {
				getAddition();
			} else if (operator == 2) {
				getSubtraction();
			} else if (operator == 3) {
				getMultiplication();
			} else {
				getDivision();
			}
		}

		// print score
		System.out.println("You got " + totalPoints + " out of 100 possible points.");
		System.out.println("You got a " + totalPoints + "% on this quiz.");

	}

}
