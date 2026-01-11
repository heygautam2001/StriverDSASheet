package CollectionsInJava.Lists;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayLists {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //Lists are Ordered Collection.Insertion ordered is maintained.
        //You can access element by using index.
        //It can contain multiple duplicate values.
        //It can also hold multiple null values.
        //ArrayList is the implementing class of List InterFace.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,50);
//        System.out.println(list.size());
//        System.out.println(list.get(1));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        System.out.println();
//        for(int ele : list){
//            System.out.print(ele+" ");
//        }

//        System.out.println(list.contains(20));

        list.remove(2);
//        System.out.println(list);

        list.remove(Integer.valueOf(50));
//        System.out.println(list);

        list.set(1,50);
//        System.out.println(list);

        // ArrayList is dynamics in size.
        // Internally it is implemented by Array.
        // Initial capacity is 10 , but you can also provide your own
        // If the insertion hit the initial capacity , it size increases the 1.5 time the actual capacity.

        ArrayList<Integer> list1 = new ArrayList<>(10);
        System.out.println(list1.size());
        // you can print capacity using reflection.

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[])field.get(list1);
//        System.out.println("Arraylist capacity : "+elementData.length);

        list1.add(1);
        list.trimToSize();

        System.out.println(list1);




    }
}
