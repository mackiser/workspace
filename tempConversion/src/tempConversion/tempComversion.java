package tempConversion;
import java.util.Scanner;

public class tempComversion {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double far = -50;

		// table headers
		System.out.print("Fahrenheit" + "\t" + "Celsius\n");

		for (int i = 0; i <= 40; i++) {

			// convert fahrenheit to celcius
			double cel = (far - 32) * 5/9;
			
			// print out conversions
			System.out.printf("%10.2f %10.2f\n", far, cel);

			// increment far by 5s
			far+=5;
		}

	}

}
