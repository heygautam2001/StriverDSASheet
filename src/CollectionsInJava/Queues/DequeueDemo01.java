package CollectionsInJava.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo01 {
    public static void main(String[] args) {
        // double ended queue
        // allows insertion and removal of the elements from both ends
        // versatile than regular queues and stacks because they support all operation of both

        /*
        Insertion
        addFirst(E e): Insert the specified element at the front
        addLast(E e): Insert the specified elements at the end.
        OfferFirst(E e): Insert the specified element at the front if possible.
        OfferLast(E e): Insert the specified elements at the end if possible.
        */

        /*
        REMOVAL METHODS
        removeFirst();
        removeLast();
        PollFirst();
        PollLast();

         */

        /*
        Examination Method
        getFirst();
        getLast();
        peekFirst();
        peekLast();

         */
        /*
        stack method
        push(E e) : Adds an element at the front (equivalent to addFirst(E e))
        pop() : equivalent to removeFirst
      */
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);
        // 5, 10 , 20, 25
        System.out.println(deque);
        System.out.println("First element :" +deque.getFirst());
        System.out.println("last element :"+deque.getLast());
        deque.removeFirst();
        deque.pollLast();

        for(int num : deque){
            System.out.println(num);
        }

    }
}
