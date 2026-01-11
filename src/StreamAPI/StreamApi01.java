package StreamAPI;

import StringsInJava.IntegerToRoman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Features introduced in java 8...
//process collection of data in a functional and declarative manner.
// simplifies data process
// Embrace functional programming , improves readability and maintains efficiency
// Enable easy parallelism
public class StreamApi01 {
    // How to use streams
    // source , Intermediate operation & terminal operation.
    public static void main(String[] args) {
        // Example count the odd numbers
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int countOdd = 0;
        for(int ele : list){
            if(ele % 2 != 0)
                countOdd++;
        }

        System.out.println(countOdd);

        // Doing with stream
        // count returns in long...
        int count = (int)list.stream().filter(x -> x % 2 != 0).count();
        System.out.println(count);


    }
}
