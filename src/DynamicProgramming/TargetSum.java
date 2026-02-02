package DynamicProgramming;
// leet-code 494
public class TargetSum {

    public int ways(int i , int []arr , int target){
        if(i == arr.length){
            if(target == 0) return 1; // valid ways
            else return 0;
        }

        int add = ways(i+1,arr,target-arr[i]);
        int sub = ways(i+1,arr , target + arr[i]);
        return add + sub;

    }
    public int findTargetSumWays(int[] nums, int target) {
        return ways(0,nums,target);

    }

    public static void main(String[] args) {

    }
}
