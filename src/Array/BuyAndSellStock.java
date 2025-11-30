package Array;

public class BuyAndSellStock {
    // Brute force approach
    public static int buySellStock(int [] arr){
        int n = arr.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int profit = 0;
            for (int j = i+1; j < n; j++) {
                profit = arr[j] - arr[i];
                maxProfit = Math.max(profit , maxProfit);
            }
        }
        return maxProfit;
    }
    // Better solution approach
    public int maxProfit(int[] prices) {
        int mini = prices[0];      // Step 1: Start with the first day's price as the minimum
        int maxProfit = 0;         // Step 2: Initialize maximum profit to 0
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            int cost = prices[i] - mini;          // Step 3: Profit if sold today
            maxProfit = Math.max(maxProfit, cost); // Step 4: Update maxProfit if this profit is greater
            mini = Math.min(mini, prices[i]);      // Step 5: Update mini if today’s price is smaller
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int arr[] = {1000,12,3,49,600,1000};
        System.out.println(buySellStock(arr));
    }
}
