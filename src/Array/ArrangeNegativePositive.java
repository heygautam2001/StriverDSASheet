package Array;

import java.util.Arrays;

public class ArrangeNegativePositive {

    public static void arrangeNegativePositive(int []arr){
        int n = arr.length;
        int[] positive = new int[n/2];
        int j = 0;
        int[] negative = new int[n/2];
        int k = 0;
        for (int i = 0; i < n ; i++) {
            if(arr[i] >= 0){
                positive[j++] = arr[i];
            }else{
                negative[k++] = arr[i];
            }
        }
        // for filling the actual array in positive and negative sequence.
        for (int i = 0; i < n/2 ; i++) {
            arr[2*i] = positive[i];
            arr[2*i + 1] = negative[i];

        }

        // negative Positive sequence

        for (int i = 0; i < n/2 ; i++) {
            arr[2*i] = negative[i];
            arr[2*i + 1] = positive[i];

        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,4,8,-9,-6,-3};
        System.out.println(Arrays.toString(arr));
        arrangeNegativePositive(arr);
        System.out.println(Arrays.toString(arr));

    }
}

// Number of positive element is always equals to negative element.
