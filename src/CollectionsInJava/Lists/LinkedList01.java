package CollectionsInJava.Lists;


import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2);// O(n)
        System.out.println(list);
        list.addLast(4); //O(1)
        list.addFirst(5);// O(1)
        System.out.println(list);
        list.getFirst();
        list.getLast();
        list.remove();
        System.out.println(list);

        list.removeIf(x->x%2 == 0);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println("size : "+list.size());

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog","Cat","Pet"));
        LinkedList<String>animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);



    }
}
