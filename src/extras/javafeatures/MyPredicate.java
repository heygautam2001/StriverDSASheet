package extras.javafeatures;

import extras.multiThreading.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface MyPredicate {
    public static void main(String[] args) {
        // Predicate is a functional Interface in Java , have a single method test ,
        // that returns a boolean value , takes generic type parameter.
//
//        Predicate<Integer> salGreaterThanOneLakh = x -> x > 100000;
//        System.out.println(salGreaterThanOneLakh.test(200000)); // true
//        System.out.println(salGreaterThanOneLakh.test(20000)); // false
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int greaterThan5Sum = numbers.stream().filter(x -> x > 5).mapToInt(n -> n).sum();
//        System.out.println(greaterThan5Sum);

//        Predicate <Integer> isEven = x -> x%2 == 0;
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        for(Integer i : numbers){
//            if(isEven.test(i)){
//                System.out.println(i);
//            }
//        }

//        Predicate <String> startsWithLetterV = str -> str.toLowerCase().charAt(0) == 'v';
//        System.out.println(startsWithLetterV.test("Vikas"));
//        System.out.println(startsWithLetterV.test("Zakkas"));

        Predicate <String> startsWithLetterV = str -> str.toLowerCase().charAt(0) == 'v';
        Predicate <String> endsWithLetterL = str -> str.toLowerCase().charAt(str.length()-1) == 'l';
        Predicate<String>and = startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("Vipul"));

        Predicate<String>or = startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("Vipin"));
        System.out.println(or.test("Gautam"));

        // Explore isEqual and negate methods...






    }

}
