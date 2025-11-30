package extras.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //imperative approach
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        // stream approach or declarative approach
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

        List<Integer> list = Arrays.asList(16, 1, 2, 3, 4, 6, 7, 8, 9, 0, 12, 13, 14, 15, 99, 105, 100);
        Stream<Integer> stream = list.stream();

        String[] arr3 = {"Cherry", "pineapple", "Banana", "Apple"};
        Stream<String> arrStream = Arrays.stream(arr3);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int) (Math.random() * 100)).limit(5);

        // Operations on Stream
        List<Integer> list1 = Arrays.asList(16, 1, 2, 3, 4, 6, 7, 8, 9, 0, 12, 13, 14, 15, 99, 105, 100);
        List<Integer> filteredList = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("list1 :"+list1);
        System.out.println("filtered list :"+filteredList);

       List<Integer> mappedList = list1.stream().map(x->x/2).collect(Collectors.toList());
        System.out.println("list1 : "+list1);
        System.out.println("mappedList : "+mappedList);

        List<Integer> mappedListDistinct = list1.stream().map(x->x/2).distinct().collect(Collectors.toList());
        System.out.println("mappedListDistict : "+mappedListDistinct);

        List<Integer> SortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("list1 : "+list1);
        System.out.println("SortedList : "+SortedList);


        List<Integer> reversedSortedList = list1.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("reversedSortedList"+reversedSortedList);

        List<Integer> reversedSortedListSkipped = list1.stream().sorted((a,b)->b-a).skip(4).collect(Collectors.toList());
        System.out.println("reversedSortedListSkipped :"+reversedSortedListSkipped);


       Integer integer =  Stream.iterate(0,x->x+1).limit(101).map(x -> x/20).distinct().max((a,b)->a-b).get();
        System.out.println(integer);




    }
}
