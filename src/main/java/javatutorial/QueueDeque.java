package javatutorial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDeque {

    public static void main(String[] args) {
        // head, tail
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println("Head of queue: " + queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);

        // see Sets.java for other ways to iterate through
        queue.forEach(System.out::println);
    }

}
