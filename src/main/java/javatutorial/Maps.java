package javatutorial;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Zero", 0);
        m.put("One", 1);
        m.put("One", 111); // replaces original value
        m.put("Two", 2);
        m.putIfAbsent("Two", 222); // does not replace value
        m.putIfAbsent("Three", 3);
        m.remove("Zero");  // returns value or null if not present
        System.out.println(m);
        System.out.println(m.get("One"));  // returns value or null if not present
        System.out.println(m.getOrDefault("Not There", 0));

        /*
        for (var entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         */

        m.forEach((key, value) -> System.out.println(key + " : " + value));


        // immutable Map
        Map stringMap = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(stringMap);
        // stringMap.put("d", 4);  // UnsupportedOperationException
    }

}
