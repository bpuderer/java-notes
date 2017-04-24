package javatutorial;

public class BikeDemo {

	public static void main(String[] args) {
		
		System.out.println("number of bikes: " + Bicycle.getNumBikes());
		
		Bicycle bike1 = new Bicycle(24, 12);
		System.out.println("bike1 gears: " + bike1.numGears);
		System.out.println("bike1 current gear: " + bike1.gear);
		
		Bicycle bike2 = new Bicycle();
		System.out.println("bike2 gears: " + bike2.numGears);
		System.out.println("bike2 current gear: " + bike2.gear);
		
		System.out.println("number of bikes: " + Bicycle.numBikes);
	}
}
