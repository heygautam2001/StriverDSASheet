package CollectionsInJava.Lists;

import java.util.ArrayList;
import java.util.Vector;

public class Vectors01 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);
//        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity()); // Doubles the capacity....

        Vector<Integer> vector1 = new Vector<>(5,3);
        vector1.add(2);
        vector1.add(5);
        vector1.add(3);
        vector1.add(2);
        vector1.add(5);
        System.out.println(vector1.capacity());
        vector1.add(7);
        System.out.println(vector1.capacity());

       // Thread safety....
        Vector<Integer> vector2 = new Vector<>(vector1);
        System.out.println(vector2);

        vector.clear();
        System.out.println(vector);
        System.out.println(vector.size());

        Vector<Integer> vector3 = new Vector<>();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 500; i++) {
                vector3.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 500; i <= 1000; i++) {
                vector3.add(i);
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(vector3.size());

    }
}
