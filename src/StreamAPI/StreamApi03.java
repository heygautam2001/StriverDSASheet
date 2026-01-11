package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi03 {
    public static void main(String[] args) {
        // Intermediate Operation on stream...
        // Intermediate operation transform a stream into another stream.
        // They are lazy,means they don't execute until a terminal operations is involved.

        List<String> list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit","Ram");
        Stream<String> filteredList = list.stream().filter(x->x.startsWith("A"));
        System.out.println(filteredList);
        // no filtering operation at this point as terminal operation is not present.
        // 1. filter
        Long res = list.stream().filter(x->x.startsWith("A")).count();
        System.out.println(res);

        //2.Map
        Stream<String> stringStream = list.stream().map((str)-> str.toUpperCase());
        System.out.println(stringStream.collect(Collectors.toList()));

        // 3. sorted
        System.out.println(list.stream().sorted().count());
        System.out.println(list.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList()));

        // 4.distinct
        System.out.println(list.stream().distinct().count());

        //5.Limit
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));

        //6.Skip
//        Stream.generate(()->1).;





    }
}
