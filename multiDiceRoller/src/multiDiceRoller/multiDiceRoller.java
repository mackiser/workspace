package multiDiceRoller;
import java.util.Scanner;
public class multiDiceRoller {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double sixDiceOne = Math.floor((Math.random() * 6) + 1);
		double sixDiceTwo = Math.floor((Math.random() * 6) + 1);
		double sixSum = sixDiceOne + sixDiceTwo;
		System.out.println("6-sided dice:");
		System.out.println("Dice 1: " + sixDiceOne);
		System.out.println("Dice 2: " + sixDiceTwo);
		System.out.println("Total: " + sixSum);
		
		double eightDiceOne = Math.floor((Math.random() * 8) + 1);
		double eightDiceTwo = Math.floor((Math.random() * 8) + 1);
		double eightSum = eightDiceOne + eightDiceTwo;
		System.out.println("\n8-sided dice:");
		System.out.println("Dice 1: " + eightDiceOne);
		System.out.println("Dice 2: " + eightDiceTwo);
		System.out.println("Total: " + eightSum);
		
		double twelveDiceOne = Math.floor((Math.random() * 12) + 1);
		double twelveDiceTwo = Math.floor((Math.random() * 12) + 1);
		double twelveSum = twelveDiceOne + twelveDiceTwo;
		System.out.println("\n12-sided dice:");
		System.out.println("Dice 1: " + twelveDiceOne);
		System.out.println("Dice 2: " + twelveDiceTwo);
		System.out.println("Total: " + twelveSum);
		
		double twentyDiceOne = Math.floor((Math.random() * 20) + 1);
		double twentyDiceTwo = Math.floor((Math.random() * 20) + 1);
		double twentySum = twentyDiceOne + twentyDiceTwo;
		System.out.println("\n20-sided dice:");
		System.out.println("Dice 1: " + twentyDiceOne);
		System.out.println("Dice 2: " + twentyDiceTwo);
		System.out.println("Total: " + twentySum);

	}

}
