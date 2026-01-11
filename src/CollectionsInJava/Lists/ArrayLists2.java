package CollectionsInJava.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Gautam","Tuesday");
        System.out.println(list1.getClass().getName());
//        list1.add("Wednesday"); // cannot add because it creates a fix size list.
//        // but you can set
        System.out.println(list1);

        String[] array = {"Hello","Mello" , "Zello"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2);

        List<Character> list3 = List.of('A','B','C','D');
        System.out.println(list3);
        list3.set(1,'F'); // Excecption
        System.out.println(list3);


    }
}
