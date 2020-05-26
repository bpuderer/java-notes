package javatutorial;

import java.util.Arrays;

public class MyArrays {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
		
		int[] testArray1;  // also:  int testArray1[];
		testArray1 = new int[5];
		testArray1[3] = 42;
		System.out.println("testArray1: " + Arrays.toString(testArray1));


		int[] testArray2 = { 2112, 42, 28, 3, 9 };
		System.out.println("testArray2: " + Arrays.toString(testArray2));
		Arrays.sort(testArray2);
		System.out.println("testArray2 sorted: " + Arrays.toString(testArray2));
		System.out.println("Found 42 at location " + Arrays.binarySearch(testArray2, 42));
		
	}
	
}
