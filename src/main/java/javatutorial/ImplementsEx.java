package javatutorial;

// implements follows extends
public class ImplementsEx implements InterfaceExPlus {
	
	public void doSomething() {
		System.out.println("something");
	}

	public void doAnotherThing() {
		System.out.println("another thing");
	}

	/*
	public void defaultMethod() {
		System.out.println("default method2");
	}
	*/
	
	public static void main(String[] args) {

		InterfaceEx.staticMethod();
		
		ImplementsEx temp = new ImplementsEx();
		temp.doSomething();
		temp.doAnotherThing();
		temp.defaultMethod();

	}

}
