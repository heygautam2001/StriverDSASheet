package CollectionsInJava.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Set01 {
    public static void main(String[] args) {
        // Set is a collection which do not have duplicate elements.
        // find / Insert O(1);
        // Map ----> HashMap , LinkedHashMap, TreeMap, SortedMap, EnumMap
        // Set ----> HashSet , LinkedHashset, TreeSet , EnumSet , SortedSet , CopyOnWriteArraySet
        // Internal Implementation ---> similar to HashMap
        Set<Integer> set = new HashSet<>();
        set.add(12);  // Not thread safe
        set.add(11);
        set.add(1);
        set.add(4);
        set.add(7);
        set.add(11); // Cannot add as it is already present
        System.out.println(set);

        Set<String> names = new LinkedHashSet<>(); // insertion order is maintained
        names.add("Gautam"); // Not thread safe
        names.add("Vinay");
        names.add("Ritik");
        names.add("Surakshit");
        names.add("Rohan");
        System.out.println(names);

        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(3);
        System.out.println(treeSet); // natural sorting order is maintained...


        // for thread safety
        // makes collection as thread safe
        Set<Integer> integers = Collections.synchronizedSet(treeSet);
        System.out.println(integers); // Performance is not guaranteed...

        synchronized (integers){
            for (int ele : integers){
                System.out.println(ele);
            }

        }

        // or for thread safety use concurrentSkipListSet
        Set<Integer> concurrentSet = new ConcurrentSkipListSet<>();





    }
}
