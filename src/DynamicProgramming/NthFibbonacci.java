package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class NthFibbonacci {

    public static int nthFibbonaccii(int num){
        if (num == 0 )
            return 0;
        if(num==1)
            return 1;
        int ans = nthFibbonacci(num-1)+nthFibbonacci(num-2);
        return ans;
    }

    public static int nthFibbonacci(int n){
        int dp[] = new int[n+1];
        for (int i = 0; i < dp.length; i++)dp[i] = -1;
        if (n == 0)
            return 0;
        if (n==1)
            return 1;
        if (dp[n] != -1)
            return dp[n]; //before recursive calling check if the ans of that call already present in the array
        // if it is present then return that ans;
        int ans = nthFibbonacci(n-1)+nthFibbonacci(n-2);
        dp[n] = ans; //Store the ans of a call inside the array before returning the ans;
        return ans;
    }

    // overloaded method
    public static int  nthFibbonacci(int n , int dp[]){
       if (n==0)
           return 0;
       if (n == 1)
           return 1;
       if (dp[n] != -1)
           return dp[n];
        // dp is an array store actual index call value.
       return dp[n] = nthFibbonacci(n-1)+nthFibbonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number");
        int n = sc.nextInt();
        System.out.println(nthFibbonaccii(n));
        System.out.println(nthFibbonacci(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(nthFibbonacci(n,dp));

    }
}
