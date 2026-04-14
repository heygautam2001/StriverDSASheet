package Array;

public class MissingAndRepeatingNumber {
    // You are given an array elements from 1 to n....
    // Your task is to find missing and repeating number in that array.
    public static int[] findMissingAndRepeatingElement(int[]arr,int n){
        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n ; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) cnt++;
            }
            if (cnt == 2) repeating = i;
            else if (cnt == 0) missing = i;
                
        }
        int [] ans = new int[]{repeating,missing};
        return ans;
    }

    public static void main(String[] args) {

    }
}
