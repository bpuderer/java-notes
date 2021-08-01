package javatutorial;

import oop.Bicycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

    public static void main(String[] args) {

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
    }

}
