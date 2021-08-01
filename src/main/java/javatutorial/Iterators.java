package javatutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(-7);
        nums.add(5);
        nums.add(-19);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                // Removes from the last element returned by this iterator
                iterator.remove();
            }
        }
        System.out.println(nums);


    }

}
