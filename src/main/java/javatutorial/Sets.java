package javatutorial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {


    public static void main(String[] args) {

        // HashSet - best performing, unordered
        // TreeSet - poor performance, ordered based on values
        // LinkedHashSet - slightly slower than HashSet, insertion-ordered

        // Collection<Type> noDupes = new HashSet<Type>(c);

        // From Oracle tutorial:
        // Note that the code always refers to the Collection by its interface type (Set) rather than by its
        // implementation type. This is a strongly recommended programming practice because it gives you the
        // flexibility to change implementations merely by changing the constructor.

        Set<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println(hs.size() + " objects in the set");
        System.out.println("set contains \"first\": " + hs.contains("first"));
        System.out.println("removing \"first\"");
        hs.remove("first");
        System.out.println("set contains \"first\": " + hs.contains("first"));
        System.out.println(hs);


        // immutable Set
        Set<String> stringSet = Set.of("a", "b", "c");
        System.out.println(stringSet);
        // stringSet.add("d");  // UnsupportedOperationException
    }

}
