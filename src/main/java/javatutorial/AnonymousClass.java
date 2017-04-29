package javatutorial;

public class AnonymousClass {

	int x = 0;
	
	interface HelloWorld {
		public void greetings();
	}

	int y = 1;
	
	public void sayHello(String you) {

		HelloWorld englishGreeting = new HelloWorld() {
			// method declarations only, no statements
			public void greetings() {
				System.out.println("hello " + you);
				System.out.println(x);
				System.out.println(y);
			}
		};

		englishGreeting.greetings();
	}

	public static void main(String[] args) {
		AnonymousClass myApp = new AnonymousClass();
		myApp.sayHello("james");
	}
}
