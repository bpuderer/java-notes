package javatutorial;

public class Operators {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		
		int i = 0;
		System.out.println("i = " + i);
		System.out.println("i++ = " + i++);
		System.out.println("i = " + i);
		System.out.println("++i = " + ++i);
		System.out.println("i = " + i);

		// bitwise
		System.out.println(10 | 3);  // 1010 | 0011 = 1011
		System.out.println(10 ^ 3);  // 1010 ^ 0011 = 1001
		System.out.println(10 & 3);  // 1010 & 0011 = 0010
		System.out.println(5 << 3);  // 101 -> 101000   5 * 2^3
		System.out.println(13 >> 2); // 1101 -> 0011
	}
	
}
