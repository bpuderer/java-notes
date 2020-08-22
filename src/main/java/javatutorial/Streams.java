package javatutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html
        // stream ops are intermediate or terminal
        // intermediate ops only executed when terminal op is present
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        Stream.of(3, 9, 0, 28, 44, 1).map(i -> i * 2).forEach(s -> System.out.println("Doubled: " + s));  // double
        Stream.of(3, 9, 0, 28, 44, 1).filter(i -> i % 2 == 0).forEach(System.out::println);  // only evens
        IntStream.of(3, 9, 0, 28, 44, 1).max().ifPresent(System.out::println);


        List<String> pythons = Arrays.asList("Terry Gilliam", "Eric Idle", "Michael Palin",
                "John Cleese", "Graham Chapman", "Terry Jones");

        String search = "John Cleese";
        if (pythons.stream().anyMatch(s -> s.equals(search))) {
            System.out.println("Found " + search);
        }

        List<String> terryPythons = pythons
                .stream()
                .filter(s -> s.startsWith("Terry"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(terryPythons);

    }
}
