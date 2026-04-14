package Array;

import java.util.HashMap;
import java.util.Map;

// You have to count the subarray whose Xor is equals to K...
public class CountSubarraysWithXorSix {
    // Brute force
    public static int countXorSubarray(int [] arr , int target){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
                for (int k = i; k <= j ; k++) {
                    xor = xor ^ arr[k];
                }
                if (xor == target) count++;
            }
        }
        return count;
    }
    // Better

    public static int countXorSubarrays(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= arr[j];
                if (xor == target) count++;
            }
        }
        return count;
    }
    // optimal solution
    public static int subarrayWithSumK(int [] arr, int target){
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        map.put(0, 1); // important: XOR 0 seen once
        for (int i = 0; i < arr.length; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ target;
            if (map.containsKey(x)) {
                cnt += map.get(x);
            }
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {


    }
}
