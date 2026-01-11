package CollectionsInJava.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
       // It means that whenever a write operation
       // like adding or removing an element
       // instead of directly modifying the existing list
       // a new copy of the list is created, and the modification is applied to that copy
       // this ensure that other threads reading the list while its being modified are unaffected.

       // read :: fast and direct.
       // write :: new copy is generated for every modification.
       // The reference to the list is then updated so that subsequent reads use this new
       // list.

//      Exception in thread "main" java.util.ConcurrentModificationException

        /*
        List<String> list1 = new ArrayList<>();
        list1.add("Bread");
        list1.add("Butter");
        list1.add("Egg");
        for (String item : list1){
            if (item == "Egg"){
                list1.add("Chicken");
                System.out.println("Added Chicken");
            }
        }
        System.out.println("Updated List : " +list1);


         */

        list.add("Egg");
        list.add("Butter");
        list.add("Naan");

        for (String item : list){
            if (item == "Egg"){
                list.add("Chicken");
                System.out.println("Added Chicken");
            }
        }
        System.out.println("Updated List : " +list);
    }
}
