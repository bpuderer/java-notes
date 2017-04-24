package javatutorial;

import java.util.Arrays;

public class Args {

	public static void main(String[] args) {

		printInts(28, 3);
		printInts(28, 3, 42, 2112);
		
		int[] testArray = { 1, 2, 3 };
		printInts(testArray);
		

		int i = 3;
		System.out.println("i: " + i);
		System.out.println("testArray: " + Arrays.toString(testArray));
		passByValue(i, testArray);
		System.out.println("i after call to passByValue: " + i);
		System.out.println("testArray after call to passByValue: " + Arrays.toString(testArray));
	}
	
	// varargs - type of last parameter followed by ellipsis
	public static void printInts(int... ints)  {
		for (int item : ints) {
			System.out.println(item);
		}
	}
	
	public static void passByValue(int i, int[] ints) {
		i++;
		ints[0] = 555;
	}
	
}
