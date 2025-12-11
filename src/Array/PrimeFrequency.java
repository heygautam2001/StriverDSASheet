package Array;

import java.util.HashMap;
import java.util.Map;

public class PrimeFrequency {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkPrimeFrequency(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }
        System.out.println(mp);
        for (int key : mp.keySet()) {
            if (isPrime(mp.get(key))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeFrequency(new int[]{1, 2, 3, 4, 5,2}));;
    }
}
