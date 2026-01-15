package CollectionsInJava.Map;
// sorted maps is and interface which extends map interface and its implementation class is
// TreeMap...
//A TreeMap in Java is a part of the java.util package that implements the Map interface.
// It stores key-value pairs in a sorted order using either a natural or custom comparator.
//TreeMap internally uses a Red-Black Tree for efficient sorting.
//Provides O(log n) time for insertion, deletion and lookup.
//TreeMap does not allow null keys, but allows null values.

import java.util.*;

public class SortedMaps {
    public static void main(String[] args) {
        SortedMap<Integer,String>map = new TreeMap<>();
        map.put(1,"Gautam");
        map.put(5,"Devraj");
        map.put(2,"Vinay");
        map.put(4,"Karn");
        map.put(3,"Arjun");
        System.out.println(map); // follows natural order of sorting

        SortedMap<String,Integer> marks = new TreeMap<>((a,b)->{
            return b.compareTo(a);
            // According to marks...
        });
        marks.put("Gautam",80);
        marks.put("Roshan",90);
        marks.put("Vinay",99);
        marks.put("Ravi",95);
        marks.put("Rohit",70);
        System.out.println(marks); // Lexicographical order...
        // provide comparator to sort it in reverse lexi order.
//        A TreeMap cannot be directly sorted by values because its ordering is defined solely by the key comparator.
//        However, you can achieve value-based sorting using well-established workarounds.

//        1. working solution...
        List<Map.Entry<String,Integer>> list = new ArrayList<>(marks.entrySet());
        System.out.println(list);

        list.sort((a,b)->{
//            return a.getValue()-b.getValue();
            return b.getValue() - a.getValue();
        });
        System.out.println(list);

//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }


        // 2.second workaround by streams
        marks.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

//        System.out.println(marks);



    }

}
