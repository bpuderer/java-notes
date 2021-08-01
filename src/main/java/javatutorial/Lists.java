package javatutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		// ArrayList only contains references, not primitives
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add(0, "zero");
		list.add("two");
		list.add("two");
		list.add("three");
		// removes first occurrence, returns boolean if was removed
		list.remove("two");
		// removes item at index if int is passed
		// pass Integer.valueOf(i) to remove Integer item
		list.remove(1);
		System.out.println(list);
		System.out.println("list size: " + list.size());
		System.out.println("is two in the list? " + list.contains("two"));
		System.out.println("second item: " + list.get(1));
		list.set(1, "One");
		Collections.sort(list);

		list.forEach(System.out::println);


		// immutable list.  Convenience method added to List in JDK 9
		List stringList = List.of("a", "b", "c");
		System.out.println(stringList);
		// stringList.add("d");  // UnsupportedOperationException
		
	}
	
}
