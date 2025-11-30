package Array;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimized {
    public static int[] optimizedTwoSum(int []arr,int target){
        int n = arr.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - arr[i];
            if(map.containsKey(partner)){
                ans[0] = map.get(partner);
                ans[1] = i;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,4,1,3};
        int[] ans = optimizedTwoSum(arr,9);
        System.out.println(Arrays.toString(ans));

    }
}
