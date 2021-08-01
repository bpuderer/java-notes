package oop;

public class ExtendsAbstractEx extends AbstractEx {

	public ExtendsAbstractEx() {
		super("ExtendsAbstractEx");
	}

	@Override
	void doSomething() {
		System.out.println("doing something");
	}

	
	public static void main(String[] args) {
		// nope.  cannot instantiate abstract class
		// AbstractEx obj = new AbstractEx();
		
		AbstractEx obj = new ExtendsAbstractEx();
		System.out.println(obj.getName());
		obj.doSomething();
	}
}
