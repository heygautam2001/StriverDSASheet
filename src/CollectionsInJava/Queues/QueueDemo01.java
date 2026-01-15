package CollectionsInJava.Queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo01 {
    // FIFO principle --> First In First Out...
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // enqueue
        queue.add(1);
        queue.add(2);
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        // Check the top element
        System.out.println(queue.peek());
        System.out.println(queue.element());

        // dequeue method
        System.out.println(queue.remove()); // throws exception if empty
        System.out.println(queue.poll()); // not throws exception
        System.out.println(queue);

        // size
        System.out.println(queue.size());

        // check for emptiness
        System.out.println(queue.isEmpty());

        // check element availability
        System.out.println(queue.contains(4));
        System.out.println(queue.contains(1));

        //clear all elements from queue
        queue.clear();
        System.out.println(queue);

        queue.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(queue);

//      queue.removeAll(/*collection*/);





    }
}
