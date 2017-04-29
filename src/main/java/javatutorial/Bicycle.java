package javatutorial;

public class Bicycle {

	// public - everyone
	// private - just class
	// protected - class, package, subclass
	// none - class, package
	int gear;
	int numGears;
	static int numBikes = 0; // class variable
	static final double SCORE = 2.83e1; // constant

	public Bicycle() {
		// explicit constructor invocation
		this(1, 3);
	}

	// if no constructor defined, default constructor called -
	// class parent's no-arg constructor
	public Bicycle(int startGear, int numGears) {
		this.gear = startGear;
		this.numGears = numGears;
		Bicycle.numBikes++;
	}

	// name and parameter types define method signature
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void printBike() {
		System.out.format("Bike: %d/%d%n", gear, numGears);
	}

	// class method
	public static int getNumBikes() {
		return numBikes;
	}

	public static void main(String[] args) {

		System.out.println("number of bikes: " + Bicycle.getNumBikes());

		Bicycle bike1 = new Bicycle(24, 12);
		bike1.printBike();

		Bicycle bike2 = new Bicycle();
		bike2.printBike();

		System.out.println("number of bikes: " + Bicycle.numBikes);
	}

}
