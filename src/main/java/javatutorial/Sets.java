package javatutorial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {


    public static void main(String[] args) {

        // HashSet - best performing, unordered
        // TreeSet - poor performance, ordered based on values
        // LinkedHashSet - slightly slower than HashSet, insertion-ordered

        // Collection<Type> noDups = new HashSet<Type>(c);

        // From Oracle tutorial:
        // Note that the code always refers to the Collection by its interface type (Set) rather than by its
        // implementation type. This is a strongly recommended programming practice because it gives you the
        // flexibility to change implementations merely by changing the constructor.

        Set<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("first");
        hs.add("second");
        System.out.println(hs);

        // iterating through set
        /*
        var i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (Iterator<String> iterator = hs.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            System.out.println(s);
        }

        for (String s : hs) {
            System.out.println(s);
        }

        hs.forEach(x -> System.out.println(x));
        */

        hs.forEach(System.out::println);


        // immutable Set
        Set<String> stringSet = Set.of("a", "b", "c");
        System.out.println(stringSet);
        // stringSet.add("d");  // UnsupportedOperationException
    }

}
