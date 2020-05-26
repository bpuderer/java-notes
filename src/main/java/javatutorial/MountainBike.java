package javatutorial;

import java.util.Objects;

public class MountainBike extends Bicycle {

	boolean hasDiscBrakes;
	
	public MountainBike() {
		this(1, 14, "Huffy", false);
	}
	
	public MountainBike(int startGear, int numGears, String brand, boolean hasDiscBrakes) {
		// call to superclass constructor must be first line
		// if superclass constructor not explicitly called, call automatically made to no-arg constructor
		super(startGear, numGears, brand);
		this.hasDiscBrakes = hasDiscBrakes;
	}
	
	public boolean getHasDiscBrakes() { return hasDiscBrakes; }
	
	public void setHasDiscBrakes(boolean hasDiscBrakes) {
		this.hasDiscBrakes = hasDiscBrakes;
	}

	// @Override annotation not technically required
	// cannot change access modifier of overridden methods to be stricter (weaker access privileges)
	@Override
	public String toString() {
		// use super to access overridden method of superclass
		return super.toString() + '\n' + String.format("MountainBike disc brakes: %b", hasDiscBrakes);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MountainBike) {
			MountainBike m = (MountainBike) obj;
			return this.getGear() == m.getGear() && this.getNumGears() == m.getNumGears()
					&& this.getBrand().equals(m.getBrand()) && hasDiscBrakes == m.getHasDiscBrakes();
		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// if you override equals, you must override hashCode as well
		return Objects.hash(this.getGear(), this.getNumGears(), this.getBrand(), hasDiscBrakes);
	}
	
	
	public static void main(String[] args) {
		
		MountainBike mb1 = new MountainBike(8, 21, "Trek", false);
		mb1.printBike();
		mb1.setGear(9);
		mb1.setHasDiscBrakes(true);
		mb1.printBike();
		
		System.out.println(MountainBike.getNumBikes());


		// polymorphism/casting example.  can only access methods of type, not instance
		Bicycle mb2 = new MountainBike();
		System.out.println(((MountainBike) mb2).getHasDiscBrakes());
	}
	
}
