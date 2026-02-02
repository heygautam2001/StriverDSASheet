package Array;

import java.util.Arrays;

// leet-code 1619
public class MeanAfterRemoving {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int st = (int)(0.05 * n);
        int en = (int)(0.05 * n);
        double sum = 0;
        int count = 0;

        for(int i = st; i < n-en; i++ ){
            sum = sum + arr[i];
            count++;

        }
        return sum/count;

    }
    public static void main(String[] args) {

    }
}
