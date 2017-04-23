package javatutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add(0, "zero");
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(1, "One");
		System.out.println(list.get(1));


		list.forEach(s -> System.out.println(s));


		for (String item : list) {
			System.out.println(item);
		}


		Iterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
