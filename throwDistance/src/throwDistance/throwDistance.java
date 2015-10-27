package throwDistance;

import java.util.Scanner;

public class throwDistance {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input the initial height (in feet): ");
		double initHeight = keyboard.nextDouble();

		System.out.print("Input the initial velocity (in feet per second): ");
		double userVelocity = keyboard.nextDouble();

		// table headers
		System.out.print("\n\tTime" + "\t" + "Height\n");
		System.out.printf(" %10.1f   %10.5f\n", 0.0, initHeight);
		
		double gravity = -16.0;
		double time = 0.0;
		double timeSq = Math.pow(time, 2);
		double heightOverTime = 1;
		String end = "Hit the ground.";

		while (heightOverTime > 0) {
			time += 0.1;
			heightOverTime = -16 * (time * time) + (userVelocity * time) + initHeight;
			
			if (heightOverTime > 0)
			System.out.printf(" %10.1f   %10.5f\n", time, heightOverTime);
			
			else
				System.out.printf(" %10.1f   Hit the ground.", time);
		}

	}

}
