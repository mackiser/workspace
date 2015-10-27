import java.util.Scanner;
public class doubleFactorial {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int n = keyboard.nextInt();
		int result = 1;
		
		if (n > 0) {
		for (int i = 1; i <= n; i+=2) {
			result = result * (n - 2);
		}
		
		System.out.println("The double factorial of " + n + " is " + result + ".");
		}
		else if (n < 0) {
			System.out.println("\nError. Please input a positive integer.");
		}

	}

	}
