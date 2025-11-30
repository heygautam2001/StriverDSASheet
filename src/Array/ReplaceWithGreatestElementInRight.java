package Array;

import java.util.Arrays;

public class ReplaceWithGreatestElementInRight {
    public static int[] replaceElement(int []arr){
        int n = arr.length;
        if (arr.length == 1){
            arr[n-1] = -1;
            return arr;
        }
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i+1; j < n; j++) {

                max = Math.max(max,arr[j]);
            }
            arr[i] = max;
//            System.out.println("max"+max);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={17,18,5,4,6,1};
        int[] trr = {400};
       int[] brr =  replaceElement(trr);
        System.out.println(Arrays.toString(brr));

    }
}
