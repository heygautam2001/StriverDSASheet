package extras.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        Supplier<List<Integer>> supplier = ()-> Arrays.asList(1,2,3,4,5);
        List<Integer> list = supplier.get();
        System.out.println(list);


        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> suppliers = ()-> 100;

        if (predicate.test(suppliers.get())){
            consumer.accept(function.apply(suppliers.get()));

        }

    }


}
