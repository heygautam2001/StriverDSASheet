package extras.collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <Integer> v1 = new Vector<>(11); // initial capacity 10.
        // capacity Increment : 2, you can also specify your own.
        Vector <Integer> v2 = new Vector<>(12,3);
        Vector <Integer> v3 = new Vector<>(Arrays.asList(2,3,4));
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        System.out.println(v1.capacity());
        System.out.println(v3);
        v2.add(0,11);
        v2.add(1,12);
        v2.add(2,13);
        System.out.println(v2);
        System.out.println(v2.size());
        System.out.println(v2.get(1));

        // All the method you can use in vector described in list Interface.


    }
}
