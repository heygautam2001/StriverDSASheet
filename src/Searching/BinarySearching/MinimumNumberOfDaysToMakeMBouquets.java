package Searching.BinarySearching;
/*
Minimum Number of Days to Make m Bouquets
You are given:
An integer array arr[]
arr[i] represents the day on which the i-th flower blooms.
An integer m
Number of bouquets required.
An integer k
Number of adjacent flowers needed to make one bouquet.
A bouquet can only be made using:
Exactly k adjacent flowers
All flowers used must have bloomed on or before the chosen day.
Your task is to find:
The minimum number of days required to make m bouquets.
If it is impossible to make m bouquets, return -1.
arr = [1,10,3,10,2]
m = 3
k = 1
 */
import java.util.Arrays;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static boolean  possible(int []arr, int day, int m , int k){
        int cnt = 0 , noOfBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day){
                cnt++;
            }else{
                noOfBouquets += (cnt/k);
                cnt = 0;
            }
        }
        noOfBouquets += (cnt/k);
        if (noOfBouquets >= m) return true;
        else return false;
    }

    public static int noOfBouquets(int[]arr,int m , int k){
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = min; i <= max ; i++) {
            if (possible(arr,i,m,k))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

    // Optimized code with binary search

    public static int noOfBouquet(int[] arr, int m, int k) {
        int n = arr.length;
        // Not enough flowers
        if ((long)m * k > n) return -1;
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
