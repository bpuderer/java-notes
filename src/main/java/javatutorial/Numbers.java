package javatutorial;

import java.text.DecimalFormat;
import java.util.Locale;

public class Numbers {

	public static void main(String[] args) {

		Float f = 3.14f;
		Double d = 0.314e1;
		System.out.println(f.compareTo(d.floatValue()));
		System.out.println(f.equals(d.floatValue()));

		Integer i = Integer.valueOf("1234");
		i += 5;
		// toString called
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.isLetter('0'));
		
		
		// java.util.Formatter
		// format == printf
		int ii = 12345;
		float ff = 3.14159f;
		System.out.format("ii value: %d, ff value: %f%n", ii, ff);
		System.out.format(Locale.FRANCE, "ii value: %d, ff value: %+08.2f%n", ii, ff);

		System.out.format("%.5f%n", Math.PI);
		System.out.println(Math.min(3, 28));
		System.out.println(Math.abs(-13));
		System.out.println(Math.pow(2, 5));
		System.out.println((int) (Math.random()*100));
		
		
		DecimalFormat df = new DecimalFormat("0.###E0");
		System.out.println(df.format(12.487));
		
		// Converting a primitive value into an object of the corresponding wrapper class = autoboxing
		// reverse is called unboxing
		//compiler does this on method invocation and assignment
		
	}	
}
