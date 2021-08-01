package javatutorial;

public class Strings {

	public static void main(String[] args) {
		
		// IMMUTABLE, equivalent to an array of characters
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
		// equals method, not == for comparison
		System.out.println("\"hello\" equals \"Hello\": " + new String("hello").equals("Hello"));
		System.out.println("\"hello\" equalsIgnoreCase \"Hello\": " + new String("hello").equalsIgnoreCase("Hello"));

		String greeting = "hello";
		greeting += " world";
		System.out.format("%s has %d chars, reversed: %s%n", greeting, greeting.length(), new StringBuilder(greeting).reverse().toString());
		System.out.println("second character: " + greeting.charAt(1));
		System.out.println("second through fourth chars: " + greeting.substring(1, 4));
		
		String cleanup = "\t\t\tstring with leading & trailing whitespace & mIxED cAsE  ";
		System.out.println("before: " + cleanup);
		cleanup = cleanup.trim().toLowerCase();  // cannot mutate String
		System.out.println("after: " + cleanup);

		System.out.println("\"&\" is in position: " + cleanup.indexOf('&'));
		System.out.println("contains \"with\": " + cleanup.contains("with"));
		System.out.println("contains \"or\": " + cleanup.contains("or"));
		System.out.println("\"&\" replaced with \"and\": " + cleanup.replace("&", "and"));

		// split returns an array
		for (String item : "one two three".split(" ")) {
			System.out.println(item);
		}

		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html
		// printf style format strings
		System.out.format("%d%n", 9);
		System.out.printf("%d%n", 10);
		System.out.print(String.format("%s %d%n", "text", 11));
		
		// converting
		System.out.println(Double.parseDouble("21.3"));
		System.out.println(Integer.parseInt("42"));
	}

}
