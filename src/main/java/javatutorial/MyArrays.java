package javatutorial;

import java.util.Arrays;

public class MyArrays {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
		
		int[] testArray1;
		testArray1 = new int[5];
		testArray1[3] = 42;
		
		int[] testArray2 = { 2112, 42, 28, 3, 9 };
		
		System.out.println("testArray1: " + Arrays.toString(testArray1));
		System.out.println("testArray2: " + Arrays.toString(testArray2));
		System.out.println("28 is at location " + Arrays.binarySearch(testArray2, 28) + " in testArray2");
		
	}
	
}
