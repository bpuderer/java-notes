package javatutorial;

public class Bicycle {

	// public - everyone
	// private - just class
	// protected - class, package, subclass
	// none - class, package
	int numGears;
	int gear;
	static int numBikes = 0;  // class variable
	static final double SCORE = 2.83e1; // constant
	
	public Bicycle() {
		// explicit constructor invocation
		this(3, 1);
	}
	
	// if no constructor defined, default constructor called -
	// class parent's no-arg constructor
	public Bicycle(int numGears, int startGear) {
		this.numGears = numGears;
		this.gear = startGear;
		Bicycle.numBikes++;
	}
	
	// name and parameter types define method signature
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	// class method
	public static int getNumBikes() {
		return numBikes;
	}
}
