package snakeEyesExperiment;

public class snakeEyesExperiment {

	/*-
	 * Author: Mac Kiser
	 * Date: 9/18/15
	 * Program performs an experiment to see how many rolls it takes to get
	 * snake eyes
	 */

	public static void main(String[] args) {
		System.out.println("This program performs an experiment to see how many times you have to roll a dice.\n");

		for (int i = 1;;) {
			double dub1 = Math.floor((Math.random() * 6) + 1);
			double dub2 = Math.floor((Math.random() * 6) + 1);

			System.out.println("\nRoll " + i);
			System.out.println("Dice 1: " + dub1);
			System.out.println("Dice 2: " + dub2);
			System.out.println("-----------");

			if (dub1 == 1.0 && dub2 == 1.0) {
				System.out.println("\nCongrats! It only took " + i + " roll(s) to " + "get snake eyes.");
				break;
			} else {
				i++;
			}
		}

	}

}
