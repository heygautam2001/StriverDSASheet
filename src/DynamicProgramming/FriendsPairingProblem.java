package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairingProblem {

    public static int  pair(int n,int[]dp){
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        if (dp[n]!=-1)
            return dp[n];
        return dp[n] = pair(n-1,dp)+ (n-1)*pair(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of friends");
        int n = sc.nextInt();
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }

}
