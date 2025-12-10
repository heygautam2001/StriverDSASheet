package Recurssion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// Leet-code 40
public class CombinationSumII {

    private static void findCombination(int idx, int[]arr, int target, Set<List<Integer>> ans, List<Integer>ds){


        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx] <= target){
            ds.add(arr[idx]);
            findCombination(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);

        }
        findCombination(idx+1, arr, target, ans, ds);
    }
    public static Set<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {1,1,1,2,3,2};
        Set<List<Integer>> ans = combinationSum(arr,4);
        System.out.println(ans);

    }
}
