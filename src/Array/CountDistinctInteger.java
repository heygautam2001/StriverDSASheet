package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leet-code 2442
public class CountDistinctInteger {
    public static int reverseDigit(int num){
        int rev = 0;
        if(num <= 9)return num;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
    public static int countDistinctIntegers(int[] nums) {
         int n = nums.length;
         int[] result = new int[n*2];
         int k = 0;
        for (int num : nums) {
            result[k++] = num;
        }
        for (int num : nums) {
            int revNum = reverseDigit(num);
            result[k++] = revNum;
        }
       return Math.toIntExact(Arrays.stream(result).distinct().count());
    }



    public static int countDistinctInteger(int[] nums) {
        List<Integer> resultant = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int rev = 0;
            resultant.add(nums[i]);
            int num = nums[i];

            while(num != 0){
                rev = rev*10 + num%10;
                num = num/10;
            }
            resultant.add(rev);
        }

        return Math.toIntExact(resultant.stream().distinct().count());

    }
    public static void main(String[] args) {
        System.out.println(reverseDigit(9));
        System.out.println(countDistinctIntegers(new int[]{1,13,10,12,31}));
        System.out.println(countDistinctInteger(new int[]{2,2,2}));

    }
}
