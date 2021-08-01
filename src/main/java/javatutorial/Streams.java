package javatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        // sequence of events that is executed for each value in a collection
        // A stream can be formed from any object that implements the Collection interface
        // (e.g., ArrayList, HashSet, HashMap, ...) with the stream() method
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html
        // stream ops are intermediate or terminal
        // intermediate ops are only executed when terminal op is present
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(3, 9, 0, 28, 44, 1);
        nums.stream().map(i -> i * 2).forEach(s -> System.out.println("Doubled: " + s));
        System.out.println(nums.stream().filter(i -> i % 2 == 0).count() + " are even");
        nums.stream().max(Integer::compare).ifPresent(System.out::println);

        // reduce is used to combine stream elements to some other form
        // reduce(initialState, (previous, object) -> actions on the object)
        // System.out.println(list.stream().reduce(0, (previousSum, num) -> previousSum + num));
        System.out.println(nums.stream().reduce(0, Integer::sum));

        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());  // same thing


        List<String> pythons = Arrays.asList("Terry Gilliam", "Eric Idle", "Michael Palin",
                "John Cleese", "Graham Chapman", "Terry Jones");

        System.out.println("Find John Cleese? " + pythons.stream().anyMatch(s -> s.equals("John Cleese")));

        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html#toList()
        // There are no guarantees on the type, mutability, serializability, or thread-safety of the List returned;
        // if more control over the returned List is required, use toCollection(Supplier).
        List<String> terryPythons = pythons
                .stream()
                .filter(s -> s.startsWith("Terry"))
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
                // .collect(Collectors.toList());
        terryPythons.forEach(System.out::println);

        // TODO: add sorted with lambda function



    }
}
