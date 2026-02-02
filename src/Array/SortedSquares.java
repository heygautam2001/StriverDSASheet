package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
       List<Integer> squares = Arrays.stream(nums).map(x->x*x).sorted().boxed().collect(Collectors.toList());
       for (int i = 0; i < nums.length; i++) {
            nums[i] = squares.get(i);
        }
       return nums;
    }

    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
