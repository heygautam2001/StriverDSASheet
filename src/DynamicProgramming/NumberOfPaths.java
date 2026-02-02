package DynamicProgramming;

public class NumberOfPaths{
    public static int  paths(int sr , int sc , int er , int ec , String str){
        if (sr > er || sc > ec)
            return 0;
        if (sr == er && sc == ec){
            System.out.println(str);
            return 1;
        }
        int rightWays =  paths(sr , sc+1 , er , ec , str+"R");
        int downWays = paths(sr+1 , sc , er , ec , str+"D");
        return rightWays+downWays;
    };

    public static int paths(int row , int col){
        if(row==1 && col == 1)
            return 1;
        if(row <= 0 || col <= 0)
            return 0;

        int rightWays = paths(row , col-1);
        int downWays = paths(row-1,col);
        return rightWays+downWays;
    }

    public static int paths(int row , int col , int[][]dp){
        if (row == 1 && col == 1)
            return 1;
        if (row <= 0 || col <= 0)
            return 0;
        if (dp[row][col] != -1)
            return dp[row][col];

        int rightWays = paths(row , col-1 , dp);
        int downWays = paths(row-1 , col , dp);
        return dp[row][col] = rightWays + downWays;
    }

    public static int numberOfPaths(int row , int col){
        int[][]dp = new int[row+1][col+1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col ; j++) {
                dp[i][j] = -1;
            }
        }
        return paths(row,col,dp);

    }

    public static void main(String[] args) {
        // Prints all possible combination
        System.out.println(paths(1,1,3,3,""));
        // Prints total number of paths
        System.out.println(paths(3,3));

        // using dp solving the same problem.
        System.out.println(numberOfPaths(3,3));
    }
}












/*
* Given a m*n matrix(Grid)finds all possible paths from source to destination...
* */
