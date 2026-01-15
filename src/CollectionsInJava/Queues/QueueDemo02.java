package CollectionsInJava.Queues;

import java.util.PriorityQueue;

public class QueueDemo02 {
    public static void main(String[] args) {
        // part of queue interface
        // orders elements based on their natural ordering (for primitives lowest first);
        // custom comparator for customised ordering
        // does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); // not stored
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // Internal working
        // Priority is implemented as a min-heap by default (for natural ordering)

    }

}
