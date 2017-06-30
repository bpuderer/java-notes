package javatutorial;


public abstract class AbstractEx {
	// abstract classes can only be subclassed
	// if subclassed, all abstract methods need implementations or else
	// it is abstract as well
	// may or may not include abstract methods 
	
	// vs. interfaces
	// can declare fields that are not static and final
	// can define public, protected and private concrete methods
	// with interfaces all fields are public, static, final
	// with interfaces all methods are public
	
	void concreteMethod() {
		System.out.println("concreteMethod in AbstractEx");
	}
	
	// abstract method = no implementation
	abstract void doSomething();
}
