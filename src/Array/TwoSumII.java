package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int []ans = new int[2];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n;j++){
                if(numbers[i]+numbers[j] == target){
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        return ans;
    }

    //Optimized with hashMap
    public int[] twoSumIIOptimized(int[] numbers, int target) {
        int [] ans = new int[2];
        int n = numbers.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i < n; i++){
            int partner = target - numbers[i];
            if(map.containsKey(partner)){
                ans[0] = map.get(partner)+1;
                ans[1] = i+1;
            }
            map.put(numbers[i],i);
        }

        return ans;
    }
//More optimized solution......
    public int[] twoSumII(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1}; // If no solution is found
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int ans[] = twoSum(arr,9);
        System.out.println(Arrays.toString(ans));


    }
}
