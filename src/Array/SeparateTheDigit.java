package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigit {
    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int ele : nums) {
            List<Integer> temp = new ArrayList<>();
            while (ele != 0) {
                temp.add(0, ele % 10);
                ele = ele / 10;
            }
            list.addAll(temp);
        }
        // Convert List<Integer> to int[]
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};

        int[] result = separateDigits(nums);

        System.out.println(Arrays.toString(result));
    }
}
