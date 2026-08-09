package StackaAndQueue;

import java.util.Arrays;
import java.util.Stack;

// monotonic stacks : when we store an element in a specific order
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int[]arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] > nums[i]){
                    arr[i] = nums[j];
                    break;
                }

            }
        }
        return arr;
    }

    public static int[] nextGreaterElement2(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[]nge = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i-- ){
          while(!st.isEmpty() && st.peek() <= nums[i]) {
              st.pop();
          }
              if(st.isEmpty()){
                  nge[i] = -1;
              }else{
                  nge[i] = st.peek();
              }
              st.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
     int[] arr = new int[]{3,2,6,4,1,6,7,5,9};
     System.out.println(Arrays.toString(arr));
     System.out.println(Arrays.toString(nextGreaterElement(arr)));
     System.out.println(Arrays.toString(nextGreaterElement2(arr)));
    }
}
