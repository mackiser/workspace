import java.util.Scanner;
public class letterCount {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String str = keyboard.nextLine();
		str = str.toUpperCase();
		int words = 1;
		char target = 'A';
		
		for (int i=0; i < 'Z'; i++) {
			int pos = 0;
			int count = 0;
			
			while (pos < str.length()) {
				if (str.charAt(pos) == target) {
					count++;
				}
				pos++;
			}
			
			if (count > 0) {
				System.out.println("The " + target + " count is " + count);
			}
			
			target++;
		}

	}

}
