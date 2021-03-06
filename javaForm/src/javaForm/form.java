package javaForm;
import java.util.Scanner;

public class form {

	public static enum Mode {
		ALPHA, ALPHANUMERIC, NUMERIC
	}
	
	public static String passwordGenerator(int length, Mode mode) throws Exception {
		
		StringBuffer buffer = new StringBuffer();
		String characters = "";
		
		switch(mode) {
		
		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
			
		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
			
		case NUMERIC:
			characters = "1234567890";
			break;
		}
		
		int charactersLength = characters.length();
		
		for(int i=0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		
		return buffer.toString();
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many characters do you want your password to be? ");
		int passwordLength = keyboard.nextInt();
		
		for(int i=0;i<1;i++){
			System.out.println("\n" + form.passwordGenerator(passwordLength,form.Mode.ALPHANUMERIC));
		}
	}

}
