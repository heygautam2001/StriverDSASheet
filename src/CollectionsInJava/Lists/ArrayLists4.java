package CollectionsInJava.Lists;

import java.util.ArrayList;
import java.util.Arrays;
// ArrayList is not thread safe.....
public class ArrayLists4 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 500; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 500; i <= 1000; i++) {
                list.add(i);
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

        System.out.println(list.size());
    }

}
