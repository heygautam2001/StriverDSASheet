package DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbTheStairs {
    //Normal recursive solution --- TLE
    public static int minCost(int arr[] , int idx){
        if (idx >= arr.length)
            return 0;
        int minCost = arr[idx]+Math.min(minCost(arr,idx+1),minCost(arr,idx+2));
        return minCost;
    }

    // Optimized solution with DP
    public static int minCost(int cost[] , int idx , int[]dp){
        if (idx >= cost.length)
            return 0;
        if(dp[idx] != -1)
            return dp[idx];
        int minimumCost = cost[idx]+Math.min(minCost(cost , idx+1 , dp) , minCost(cost , idx+2 , dp));
        dp[idx] = minimumCost;
        return minimumCost;
    }
    public static void main(String[] args) {

        //With normal solution
        int arr[] = {10,15,20};
       int minimumCost = Math.min(minCost(arr,0) , minCost(arr,1));
       System.out.println(minimumCost);

       // With DP approach solution.
       int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(Math.min(minCost(arr,0,dp), minCost(arr,1,dp)));
    }
}
