package Array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    // Leaders : Everything in the right of a specific element should be smaller
    public static List<Integer> leadersBrute(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        List<Integer> ans = leadersBrute(arr);
        System.out.println(ans);
    }
}
