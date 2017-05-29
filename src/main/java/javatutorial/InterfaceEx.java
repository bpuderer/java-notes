package javatutorial;


public interface InterfaceEx {
	// only constants, method signatures, default methods, static methods, nested types
	// all abstract, default, and static methods in interface are implicitly public
	
	// constants are implicitly public, static, final
	double SCORE = 2.83e1;
	
	// abstract - just declaration, no implementation
	void doSomething();

	// if this interface is extended...
	// don't mention default method - inherited
	// redeclare method - abstract
	// redefine method - override
	default void defaultMethod() {
		System.out.println("default method");
	}
	
	// belongs to class rather than instance of class
	// static methods in interfaces are never inherited
	static void staticMethod() {
		System.out.println("static method");
	}
}
