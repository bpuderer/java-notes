package javatutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

// public class Bicycle implements Comparable<Bicycle> {
// class that's declared final cannot be subclassed 
public class Bicycle {

	// public - everyone
	// private - just class
	// protected - class, package, subclass
	// none - class, package
	private int gear;
	private int numGears;
	private String brand;
	private static int numBikes = 0; // class variable
	static final double SCORE = 2.83e1; // constant

	public Bicycle() {
		// explicit constructor invocation
		this(1, 1, "Huffy");
	}

	// if no constructor defined, default constructor called -
	// class parent's no-arg constructor
	public Bicycle(int startGear, int numGears, String brand) {
		this.gear = startGear;
		this.numGears = numGears;
		this.brand = brand;
		numBikes++;
	}

	public int getGear() { return gear; }
	
	public int getNumGears() { return numGears; }
	
	public String getBrand() { return brand; }
	
	// name and parameter types define method signature
	public void setGear(int gear) {
		this.gear = gear;
	}

	// class method
	public static int getNumBikes() {
		return numBikes;
	}
	
	public void printBike() {
		System.out.println(this);
	}
	
	/*
	@Override
	public int compareTo(Bicycle b) {
		// https://stackoverflow.com/questions/2728793
		return this.numGears - b.numGears;
	}
	*/
	
	@Override
	public String toString() {
		return String.format("Bike: %d/%d %s", gear, numGears, brand);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bicycle) {
			Bicycle b = (Bicycle) obj;
			return this.gear == b.getGear() && this.numGears == b.getNumGears() && this.brand.equals(b.getBrand());
		}
		else
			return false;
		
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Bicycle b = (Bicycle) obj;
		return this.gear == b.getGear() && this.numGears == b.getNumGears() && this.brand.equals(b.getBrand());
		*/
	}
	
	@Override
	public int hashCode() {
		// if you override equals, you must override hashCode as well
		return Objects.hash(gear, numGears, brand);
	}
	
	// final methods cannot be overridden
	// methods called in constructors should be final
	public final void cannotOverride() {
		System.out.println("34-28");
	}
	
	
	public static void main(String[] args) {

		System.out.println("number of bikes: " + Bicycle.getNumBikes());
		
		List<Bicycle> bikes = new ArrayList<>();
		bikes.add(new Bicycle(5, 11, "Trek"));
		bikes.add(new Bicycle(11, 11, "Bottecchia"));
		bikes.add(new Bicycle(12, 24, "Schwinn"));
		bikes.add(new Bicycle());
		bikes.add(new Bicycle(3, 11, "Klein"));
		bikes.add(new Bicycle(1, 10, "Fuji"));
		
		// sorts an instance of List whose element type implements the interface Comparable
		// Collections.sort(bikes);

		// Collections.sort(bikes, (a, b) -> a.getNumGears() < b.getNumGears() ? -1 : a.getNumGears() == b.getNumGears() ? 0 : 1);
		Collections.sort(bikes, Comparator.comparing(Bicycle::getNumGears));
		System.out.println("Sorted by number of gears:");
		bikes.forEach(System.out::println);
		
		// Collections.sort(bikes, (a, b) -> a.getBrand().compareToIgnoreCase(b.getBrand()));
		Collections.sort(bikes, Comparator.comparing(Bicycle::getBrand, String.CASE_INSENSITIVE_ORDER).reversed());
		System.out.println("Sorted by brand, reversed:");
		bikes.forEach(Bicycle::printBike);
		
		Collections.sort(bikes, Comparator.comparing(Bicycle::getNumGears)
				.thenComparing(Comparator.comparing(Bicycle::getBrand, String.CASE_INSENSITIVE_ORDER)));
		System.out.println("Sorted by number of gears then brand:");
		bikes.forEach(Bicycle::printBike);
		
		System.out.println("number of bikes: " + Bicycle.numBikes);
		
		
		// equals and hashCode	
		Bicycle b1 = new Bicycle(5, 11, "Trek");
		Bicycle b2 = new Bicycle(5, 11, "Trek");
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());

		b1.setGear(3);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
	}

}
