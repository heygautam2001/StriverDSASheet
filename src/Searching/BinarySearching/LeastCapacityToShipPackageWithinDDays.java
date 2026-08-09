package Searching.BinarySearching;

import java.util.Arrays;

public class LeastCapacityToShipPackageWithinDDays {
    public static int dayRequired(int[]weight , int capacity){
        int days = 1 , load = 0;
        for (int i = 0; i < weight.length; i++) {
            if (load + weight[i] > capacity){
                days = days + 1;
                load = weight[i];
            }else {
                load += weight[i];
            }
        }
        return days;
    }
    public static int leastCapacityToShipPackage(int[]weight , int days){
        int max = Arrays.stream(weight).max().getAsInt();
        int sum = Arrays.stream(weight).sum();
        for (int capacity = max; capacity <= sum; capacity++){
            int daysRequired = dayRequired(weight,capacity);
            if (daysRequired <= days) return capacity;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
