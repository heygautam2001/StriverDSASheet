package extras.javafeatures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator1 implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
       return o2-o1;
    }

    // we can use lamba expression inplace of implementation of single method;
}

public class MyComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        list.sort(new MyComparator1());
        System.out.println(list);
        list.sort((o1,o2)-> o1-o2);
        System.out.println(list);
        list.sort((o1,o2)-> o2-o1); //  lambda expression...
        System.out.println(list);

    }
}
