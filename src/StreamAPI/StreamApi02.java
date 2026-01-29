package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi02 {
    public static void main(String[] args) {
        // Creating a stream...
        // From collection
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer>stream = list.stream();

        // From Arrays
        String [] array = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);

        // Using Stream Of method
        Stream<String> stream2 = Stream.of("Vipul","Gautam" , "Vinay");

        //Infinite stream
        Stream <Integer> generate = Stream.generate(()->1);
        System.out.println(generate);
        System.out.println(Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList()));


    }
}
