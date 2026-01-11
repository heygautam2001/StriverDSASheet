package StreamAPI;

import java.util.function.Predicate;

// Predicate is a functional interface which is used to check the condition.
//class MyPredicate<T> implements Predicate<T>{
//    @Override
//    public boolean test(T t) {
//        return false;
//    }
//}
public class PredicateInterface {
    public static void main(String[] args) {
        Predicate <Integer> checkEven = num -> num % 2 == 0;
        System.out.println(checkEven.test(25));
        Predicate <String> isWordStartWithA = str -> str.startsWith("A");
        System.out.println(isWordStartWithA.test("Arush"));

        Predicate <String> isWordEndsWithH = str -> str.endsWith("h");
        System.out.println(isWordEndsWithH.test("Arush"));

        System.out.println(isWordStartWithA.and(isWordEndsWithH).test("AyusF"));
        System.out.println(isWordEndsWithH.or(isWordStartWithA).test("AoLA"));









    }
}
