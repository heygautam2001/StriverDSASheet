package StackaAndQueue;

public class SumOfSubArrayMinimum {
    public static int sumOfSubArrayMinimum(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int minimum = arr[i];
            for (int j =i; j < arr.length; j++) {
                minimum = Math.min(arr[j] , minimum);
                sum = sum+minimum;
            }
        }

        return sum;
    }
    public static void main(String[] args) {

    }
}
