package extras.javafeatures;

import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<Integer> printNumber = (num)-> System.out.println(num);
        printNumber.accept(523);
        Consumer<Integer> printLoop = (num)->{
            for (int i = 1; i <= num; i++) {
                System.out.println(i+" Hello Gautam");
            }
        };
        printLoop.accept(5);

       Consumer<Integer> consumer = printNumber.andThen(printLoop);
       consumer.accept(10);
    }


}
