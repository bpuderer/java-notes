package javatutorial;

public class EnclosingClass {

	static int x = 0;

	public static void enclosingClassMethod(String arg1) {

		int y = 1;

		class LocalClass {
			
			LocalClass(String arg2) {
				// "Local variable y defined in an enclosing scope must be final or effectively final"
				// y = 2;
				System.out.println(arg1);
				System.out.println(arg2);
				System.out.println(x);
				System.out.println(y);
			}
			
			// The field welcome cannot be declared static in a non-static inner type,
			// unless initialized with a constant expression
			// public static String welcome = "greetings from LocalClass";
			public static final String welcome = "greetings from LocalClass";
			
			public void greetings() {
				System.out.println(welcome);
			}

		}

		LocalClass lc = new LocalClass(arg1);
		lc.greetings();

	}

	public static void main(String[] args) {
		enclosingClassMethod("from main");
	}
}