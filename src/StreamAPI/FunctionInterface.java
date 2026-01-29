package StreamAPI;

// Main Features of java 8
// 1. Lambda Expression
// 2.streams
// 3. Functional Programming
// 4. Date and Time API
// 5. Method reference.

import java.util.function.Function;
class MyFunction implements Function<String,Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionInterface {
    public static void main(String[] args) {
        Function<String,Integer> stringLength = str -> str.length();
        int x = stringLength.apply("Gautam");
        System.out.println(x);

        Function<Integer,Integer> doubleIt = num -> num*2;
        Function<Integer,Integer> tripleIt = num -> num*3;
        System.out.println(doubleIt.apply(5));
        System.out.println(tripleIt.apply(6));

        // Methods in Function andThen , compose , apply , identity
        System.out.println(doubleIt.andThen(tripleIt).apply(5));
        System.out.println(tripleIt.andThen(doubleIt).apply(6));

        System.out.println(doubleIt.compose(tripleIt).apply(20));

        Function<String,String> identity = Function.identity();
        System.out.println(identity.apply("Gautam"));

//        MyFunction function = new MyFunction();
//        System.out.println(function.apply("Gautam"));

    }
}
