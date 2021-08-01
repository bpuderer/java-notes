package javatutorial;

public class Primitives {

	public static void main(String[] args) {

		// all have wrapper classes: Byte, Short, Integer, Long, Float
		// Double, Boolean, Character

		byte b = 127;  // 8-bit, -128 to 127
		short s = 28;  // 16-bit, -32768 and 32767
		int i = 0b10110;  // 32-bit, -2^31 and 2^31-1
		// int j = 4.2;  // not allowed, loss of info
		long l = 2_147_483_648L;  // 64-bit, -2^63 and 2^63-1
		
		float f = 3.14f;  // 32-bit
		double d = 2.83e1;  // 64-bit
		
		boolean bool = true;
		
		char c = '\u01a4';  // 16-bit

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		
	}
	
}
