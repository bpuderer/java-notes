package javatutorial;

public class Strings {

	public static void main(String[] args) {
		
		// IMMUTABLE, equivalent to an array of characters
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
		String greeting = "hello";
		greeting += " world";
		System.out.format("%s has %d chars, reversed: %s%n", greeting, greeting.length(), new StringBuilder(greeting).reverse().toString());
		
		System.out.println("second character: " + greeting.charAt(1));
		System.out.println("second through fourth chars: " + greeting.substring(1, 4));
		
		String cleanup = "\t\t\tstring with leading & trailing whitespace & mIxED cAsE  ";
		System.out.println("before: " + cleanup);
		cleanup = cleanup.trim().toLowerCase();
		System.out.println("after: " + cleanup);

		System.out.println("\"&\" is in position: " + cleanup.indexOf('&'));
		System.out.println("contains \"with\": " + cleanup.contains("with"));
		System.out.println("contains \"or\": " + cleanup.contains("or"));
		System.out.println("\"&\" replaced with \"and\": " + cleanup.replace("&", "and"));
		
		System.out.println("\"hello\" equals \"Hello\": " + new String("hello").equals("Hello"));
		System.out.println("\"hello\" equalsIgnoreCase \"Hello\": " + new String("hello").equalsIgnoreCase("Hello"));
		
		
		// MUTABLE
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.format("%s length:%d capacity:%d%n", sb, sb.length(), sb.capacity());
		sb.append(" world good to see you");
		System.out.format("%s length:%d capacity:%d%n", sb, sb.length(), sb.capacity());
		sb.insert(sb.indexOf("world"), "awesome ");
		System.out.println(sb);
		
		int awesomeLocation = sb.indexOf("awesome");
		sb.replace(awesomeLocation, awesomeLocation+"awesome".length(), "amazing");
		System.out.println(sb);
		
		sb.delete(sb.indexOf(" good"), sb.length());
		System.out.println(sb);

		System.out.println(addSpaces("HelloMeIt'sMeAgain"));

		
		// format strings
		int i = 0;
		System.out.format("i = %d%n", i);
		String fs;
		fs = String.format("i = %d", i);
		System.out.println(fs);
		
		// converting
		var d = Double.parseDouble("28.3");
		String s = Double.toString(d);
		System.out.println(s);

	}

	/**
	 * Add space before capitalized letter except first
	 * @param text jumbled text
	 * @return corrected text
	 */
	public static StringBuilder addSpaces(String text) {
		StringBuilder sb = new StringBuilder();

		for (var i=0; i<text.length(); i++ ) {
			if (Character.isUpperCase(text.charAt(i)) && i != 0) {
				sb.append(" ");
			}
			sb.append(text.charAt(i));
		}

		return sb;
	}

}
