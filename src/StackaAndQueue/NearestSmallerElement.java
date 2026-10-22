package StackaAndQueue;

import java.lang.reflect.Array;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    public static int[] nearestSmallerElement(int[]nums){
        int []ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if (nums[j] < nums[i])
                {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static int[] nearestSmallerElements(int[]arr){
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&  st.peek() >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,2,10,8};
        int []nse = nearestSmallerElement(arr);
        System.out.println(Arrays.toString(nse));
        int []nse2 = nearestSmallerElements(arr);
        System.out.println(Arrays.toString(nse2));


    }
}
