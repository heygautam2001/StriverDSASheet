package CollectionsInJava.Set;

import CollectionsInJava.Map.ConcurrentSkipListMaps;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySets {
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        for (int i = 1; i <= 5; i++) {
            set.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: "+ set);
        System.out.println("Initial ConcurrentSkipListSet: "+ concurrentSkipListSet);

        System.out.println("\n Iterating and modifying  CopyOnWriteArraySet :");
        for(Integer num : concurrentSkipListSet){
            System.out.println("Reading  ConcurrentSkipListSet : " +num);
           concurrentSkipListSet.add(6);
        }

        for(Integer num : set){
            set.add(6);
            System.out.println("Reading  ConcurrentSkipListSet : " +num);

        }
       System.out.println(set);
    }
}
