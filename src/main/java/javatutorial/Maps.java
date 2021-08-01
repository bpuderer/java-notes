package javatutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Zero", 0);
        m.put("One", 1);
        m.put("One", 111); // replaces original value
        m.put("Two", 2);
        m.putIfAbsent("Two", 222); // does not replace value
        m.putIfAbsent("Three", 3);
        m.remove("Zero");  // returns value or null if not present
        System.out.println(m);
        System.out.println("Does the map contain key Zero? " + m.containsKey("Zero"));
        System.out.println("Does the map contain key Two? " + m.containsKey("Two"));
        System.out.println(m.get("One"));  // returns value or null if not present
        System.out.println(m.getOrDefault("Not There", 0));

        // some ways to iterate/print
        for (String key : m.keySet()) {  // also values()
            System.out.println(key + ":" + m.get(key));
        }

        m.forEach((key, value) -> System.out.println(key + "/" + value));

        //for (var entry : m.entrySet()) {
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        // putIfAbsent where value is a list
        Map<String, List<String>> translations = new HashMap<>();
        translations.putIfAbsent("one", new ArrayList<String>());
        translations.get("one").add("uno");
        System.out.println(translations);


        // immutable Map
        Map stringMap = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(stringMap);
        // stringMap.put("d", 4);  // UnsupportedOperationException
    }

}
