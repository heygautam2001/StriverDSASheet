package DynamicProgramming;

public class NthFibbonacciTabulation {
    public static int NthFibbonacci(int n){

        int dp[] = new int[n+1];
       if (n>0)dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(NthFibbonacci(7));
    }
}
