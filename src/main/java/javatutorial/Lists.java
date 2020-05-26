package javatutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add(0, "zero");
		list.add("two");
		list.remove("two");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.set(1, "One");

		// see Sets.java for other ways to iterate through
		list.forEach(System.out::println);


		// immutable list.  Convenience method added to List in JDK 9
		List stringList = List.of("a", "b", "c");
		System.out.println(stringList);
		// stringList.add("d");  // UnsupportedOperationException
		
	}
	
}
