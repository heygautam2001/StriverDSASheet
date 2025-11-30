package extras.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    /*

    Note : generics types allow you to define a class , interfaces or a method
    with placeholders(type parameter) for the data types they will work with.

     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();
        list.add("Hello");
        list.add("Gautam");
//        list.add(1);// Not allowed because generics make it type safe
        // it means only String value allowed in this list
        System.out.println(list);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        list3.add(12.1);
        list3.add(11.1);
        list3.add(41.5);
        list3.add(12.2);
        System.out.println(list3);

    }
}
