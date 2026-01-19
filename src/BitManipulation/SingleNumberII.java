package BitManipulation;

import java.util.Arrays;
// leet-code - 137
public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        int ones = 0,twos = 0 , threes = 0;
        for(int i = 0; i < nums.length; i++ ){
            ones = (ones^nums[i]) & ~twos;
            twos = (twos^nums[i]) & ~ones;
            threes = (threes^nums[i]) & ~twos;
        }
        return ones;
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1; i < n; i = i+3 ){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[n-1];

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2,4,4,4}));
    }
}
