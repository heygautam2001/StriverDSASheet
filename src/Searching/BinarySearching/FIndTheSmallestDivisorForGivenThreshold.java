package Searching.BinarySearching;

import java.util.Arrays;

/*
The problem “Find the smallest divisor for a given threshold” means:

You are given:
An integer array nums[]
An integer threshold
You must choose a positive integer divisor d such that:
Divide every element of the array by d
Take the ceiling value of each division
Add all the results
Find the smallest divisor such that the total sum is:
<= threshold

 */
public class FIndTheSmallestDivisorForGivenThreshold {
   public static int smallestDivisorForGivenThreshold(int []arr, int threshold){
//       int min = Arrays.stream(arr).min().getAsInt();
       int max = Arrays.stream(arr).max().getAsInt();

       for (int d = 1; d <= max ; d++) {
           int sum = 0;
           for (int i = 0; i < arr.length; i++) {
               sum = (int) (sum + Math.ceil( (double)arr[i]/d));
           }
           if (sum <= threshold)
               return d;
       }

       return -1;
   }
    public static void main(String[] args) {

    }
}
