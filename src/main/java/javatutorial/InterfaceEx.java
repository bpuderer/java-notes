package javatutorial;


public interface InterfaceEx {
	// interfaces can only be implemented by classes or extended by other interfaces
	// only constants, method signatures, default methods, static methods, nested types
	// all abstract, default, and static methods in interface are implicitly public
	
	// constants are implicitly public, static, final
	double SCORE = 2.83e1;
	
	// abstract - just declaration, no implementation
	// methods in an interface that are not declared as default or static are
	// implicitly abstract
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
