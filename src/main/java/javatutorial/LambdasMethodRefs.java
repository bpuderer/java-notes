package javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasMethodRefs {

	public static void main(String[] args) {

		List<Bicycle> bikes = new ArrayList<>();
		bikes.add(new Bicycle(2, 10));
		bikes.add(new Bicycle(12, 24));
		bikes.add(new Bicycle(10, 16));
		bikes.add(new Bicycle(8, 24));
		
		// lambda format
		// comma separated list of params -> body (single expression or statement block)
		// use method reference instead of lambda for existing methods
		
		bikes.forEach(Bicycle::printBike);
		
		System.out.println("Greater than 10 speeds:");
		List<Bicycle> greaterThanTenSpeeds = bikes.stream().filter(b -> b.numGears > 10).collect(Collectors.toList());
		// greaterThanTenSpeeds.forEach(b -> b.printBike());
		greaterThanTenSpeeds.forEach(Bicycle::printBike);

		// same as previous without collect
		System.out.println("Greater than 10 speeds:");
		bikes.stream().filter(b -> b.numGears > 10).forEach(Bicycle::printBike);
		
		int[] numArray = { 28, 3, 9 };
		System.out.println(Arrays.toString(numArray));
		System.out.println("Elements doubled:");
		Arrays.stream(numArray).map(n -> n * 2).forEach(System.out::println);
		
	}
	
}
