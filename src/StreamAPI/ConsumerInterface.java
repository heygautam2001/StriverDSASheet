package StreamAPI;

import java.util.function.Consumer;

public class ConsumerInterface {
    // Takes the objects , uses it and return nothing.
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5};
        Consumer<int[]> printArray = (brr)-> {
           for(int ele : brr){
               System.out.print(ele+" ");
           }
        };
        printArray.accept(arr);
        System.out.println();
        printArray.andThen(printArray).accept(new int[]{2,3,4,5,7,8,9});


    }

}
