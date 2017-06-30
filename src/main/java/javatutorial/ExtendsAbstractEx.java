package javatutorial;

public class ExtendsAbstractEx extends AbstractEx {

	@Override
	void doSomething() {
		System.out.println("doing something");
	}

	
	public static void main(String[] args) {
		// nope.  cannot instantiate abstract class
		// AbstractEx obj = new AbstractEx();
		
		AbstractEx obj = new ExtendsAbstractEx();
		obj.concreteMethod();
		obj.doSomething();
	}
}
