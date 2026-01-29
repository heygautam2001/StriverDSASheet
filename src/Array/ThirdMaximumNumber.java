package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());
        if (list.size() < 3) {
            return Collections.max(list);
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int num : list){
            if(num > first){
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            }else{
                third = num;
            }
        }
        return third;
    }


    public int thirdMaximum(int[] nums) {
        Long first = null, second = null, third = null;

        for (int n : nums) {
            long num = n;

            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[]arr = {2,3};
        System.out.println(thirdMax(arr));
    }
}
