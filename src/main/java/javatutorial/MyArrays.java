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


		int[][] multiDimArray = new int[3][4];
		multiDimArray[0][1] = 4;
		multiDimArray[1][2] = 10;
		multiDimArray[2][3] = 3;
		System.out.println(arrayAsString(multiDimArray));
	}

	public static String arrayAsString(int[][] array) {
		StringBuilder sb = new StringBuilder();
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				sb.append(array[row][column]);
				sb.append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
