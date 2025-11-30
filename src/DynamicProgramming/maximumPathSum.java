package DynamicProgramming;

import java.util.Scanner;

public class maximumPathSum {
    static int[][] dp;
    public static int path(int arr[][] , int r , int c){
        int n = arr.length; int m = arr[0].length;
        if (r==n || c < 0 || c==m)return Integer.MIN_VALUE;
        if (r==n-1) return arr[r][c];
        if (dp[r][c] != 0 )return dp[r][c];
        int left = path(arr,r+1,c-1);
        int down = path(arr,r+1,c);
        int right = path(arr,r+1,c+1);
        return dp[r][c] = arr[r][c] + Math.max(left,Math.max(down,right));
    }
        public static int maximumPath(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int ans = -1;

        for (int j = 0; j < m; j++) {
            ans = Math.max(ans,path(arr,0,j));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int n = sc.nextInt();
        System.out.println("Enter column");
        int m = sc.nextInt();

    }
}

/*
* You are given a matrix mat[][] of size n x m where each element is a
* positive integer. Starting from any cell in the first row,
* you are allowed to move to the next row, but with specific movement constraints.
*  From any cell (r, c) in the current row, you can move to any of the three possible positions :

(r+1, c-1) — move diagonally to the left.
(r+1, c) — move directly down.
(r+1, c+1) — move diagonally to the right.
Find the maximum sum of any path starting from any column in the first row and ending at any column in the last row, following the above movement constraints.

Examples :

Input: mat[][] = [[3, 6, 1], [2, 3, 4], [5, 5, 1]]
Output: 15
Explanation: The best path is (0, 1) -> (1, 2) -> (2, 1). It gives the maximum sum as 15.
Input: mat[][] = [[2, 1, 1], [1, 2, 2]]
Output: 4
Explanation: The best path is (0, 0) -> (1, 1). It gives the maximum sum as 4.
Input: mat[][] = [[25]]
Output: 25
Explanation: (0, 0) is the only cell in mat[][], so maximum path sum will be 25.
Constraints:
1 ≤ mat.size() ≤ 500
1 ≤ mat[i].size() ≤ 500
1 ≤ mat[i][j] ≤ 1000


* */
