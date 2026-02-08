package DynamicProgramming;

public class Knapsack01DP {

    public static int profit(int idx ,int []val, int[] wt, int c ,int [][]dp){
        if (idx == wt.length)
            return 0;

        if (dp[idx][c] != -1){
            return dp[idx][c];
        }
        int skip = profit(idx+1, val , wt, c,dp);
        if (wt[idx] > c) return dp[idx][c] = skip;
        int pick = val[idx] + profit(idx+1,val,wt,c-wt[idx],dp);
        return dp[idx][c] = Math.max(pick,skip);
    }

    public static void main(String[] args) {
        int []val = {5,3,9,16};
        int []wt = {1,2,8,10};
        int C = 8;
        int [][]dp = new int[val.length+1][C+1];
        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j < dp[0].length  ; j++) {
                dp[i][j] = -1;
            }
        }
        profit(0,val,wt,C,dp);
        System.out.println( profit(0,val,wt,C,dp));
    }
}
