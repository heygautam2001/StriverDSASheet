package Array;

import java.util.Arrays;

public class MaximumProductTripletBetter {
    static int maxProduct(int[] arr) {
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int max = maxProduct(arr);
        System.out.println(max);
    }
}
