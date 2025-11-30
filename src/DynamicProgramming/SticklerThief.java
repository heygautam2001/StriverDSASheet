package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SticklerThief {
    public static void stickerWays(int arr[] , int idx , String str){
        if (idx >= arr.length) {
//            System.out.println(str);
            return;
        }
        System.out.println(str);
        stickerWays(arr , idx + 2, str+"P");
        stickerWays(arr , idx + 1 , str+"S");

    }

    //Without providing the dp
    public static int  maxProfit(int arr[] , int idx){
        if (idx >= arr.length) {
            return 0;
        }

        int steal = arr[idx] + maxProfit(arr , idx+2);
        int skip = maxProfit(arr , idx+1);
        return Math.max(steal , skip);
    }

    public static int  maxLoot(int arr[] , int idx , int[]dp ){
        if (idx >= arr.length)return 0;
        if (dp[idx] != -1)return dp[idx];
        int steal = arr[idx] + maxLoot(arr , idx+2 , dp);
        int skip = maxLoot(arr , idx+1,dp);
        return dp[idx] = Math.max(steal , skip);
    }



    public static void main(String[] args) {
    // Print all the combination  a thief is used to steal the house
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//       stickerWays(arr , 0 , "");
        int dp[] = new int[arr.length];
        Arrays.fill(dp , -1);
        System.out.println( maxProfit(arr , 0));
        System.out.println(maxLoot(arr , 0 , dp));
    }
}

















/*
* Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.
Given an array, arr[] where arr[i] represents the amount of money in the i-th house.
Determine the maximum amount he can loot.

Examples:

Input: arr[] = [6, 5, 5, 7, 4]
Output: 15
Explanation: Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6 + 5 + 4 = 15.
Input: arr[] = [1, 5, 3]
Output: 5
Explanation: Loot only 2nd house and get maximum amount of 5.
Input: arr[] = [4, 4, 4, 4]
Output: 8
Explanation: The optimal choice is to loot every alternate house. Looting the 1st and 3rd houses, or the 2nd and 4th, both give a maximum total of 4 + 4 = 8.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
*
* */

//202. Happy Number
//263. Ugly Number
//231. Power of Two