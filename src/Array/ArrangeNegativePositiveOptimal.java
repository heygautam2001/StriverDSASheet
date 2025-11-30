package Array;

import java.util.Arrays;

public class ArrangeNegativePositiveOptimal {
    public static int[] arrangePositiveNegative(int[] arr){

        int n = arr.length;
        int posIndex = 0;
        int negIndex = 1;
        int ans[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int []arr = {1, 2, 4,-1, 8, -9, -6, -3};
        System.out.println(Arrays.toString(arr));
        int [] arr1 =  arrangePositiveNegative(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
// No of positive element equals to the negative elements