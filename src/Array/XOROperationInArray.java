package Array;

import java.util.Arrays;

public class XOROperationInArray {
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

//        System.out.println(Arrays.toString(nums));
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        return xor;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }

    }