package javatutorial;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Misc {

	public static void main(String[] args) {
		
		// types of variables: instance, class (static), local, parameters 
		
		// type casting
		System.out.println((int) (Math.random() * 10));
		
		// escape sequences
		// \t \b \n \r \f \' \" \\
		System.out.println(
				"\"Those are my principles, and if you don't like them...\t\twell, I have others.\"\n- Groucho Marx");

		// user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number.");
		int userInt = scanner.nextInt();
		System.out.println("You entered " + userInt);
		scanner.close();

		// random number
		Random random = new Random();
		System.out.println("Here's a random number: " + random.nextInt(28) + 1);

		// constant
		final int CONST_EX = 9;

		// type inference added in Java 10.  JEP 286 https://openjdk.java.net/jeps/286
		// local only, initialization required, not allowed in headers
		var list = new ArrayList<String>();
	}
	
}
