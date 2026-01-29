package StreamAPI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        // Takes Nothing as a parameter only gives the objects......
        Supplier<String> give = () -> "Hello Gautam";
        System.out.println(give.get());

        Supplier<Exception> suppliers = ()-> {
            throw new RuntimeException("element not found");
        };
//        supplier.get();

        // Combined example
        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () ->  100;
        if(predicate.test(supplier.get())){
            consumer.accept( function.apply(supplier.get()));
        }

    }
}
