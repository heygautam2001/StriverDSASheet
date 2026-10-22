package StackaAndQueue;

import java.util.*;

public class NextGreaterElementII {
    public static int[] nextGreater(int[]nums) {
        int[]nge = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nge[i] = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    nge[i] = nums[j];
                    break;
                }
            }

            if (nge[i] == -1) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] > nums[i]) {
                        nge[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return nge;
    }
    public static void main(String[] args) {
    }
}

