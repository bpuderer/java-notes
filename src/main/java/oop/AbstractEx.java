package oop;


public abstract class AbstractEx {
	// abstract classes can only be subclassed/extended.  templates.
	// if subclassed, all abstract methods need implementations or else it is abstract as well
	// may or may not include abstract methods 
	
	// vs. interfaces
	// can declare fields that are not static and final
	// can define public, protected and private concrete methods
	// with interfaces all fields are public, static, final
	// with interfaces all methods are public

	private final String name;

	public AbstractEx(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// abstract method = no implementation
	abstract void doSomething();
}
