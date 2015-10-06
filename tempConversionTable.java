import java.util.Scanner;

public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	double far = -50.00;

	// table headers
	System.out.print("Fahrenheit" + "\t" + "Celcius");

	for (int i = 0; i < 40; i++) {

		// convert fahrenheit to celcius
		double cel = (far - 32) * (9/5);

		// print out conversions
		System.out.print(far + "\t");
		System.out.print(cel + "\t");

		// increment far by 5s
		far+=5;
	}
}