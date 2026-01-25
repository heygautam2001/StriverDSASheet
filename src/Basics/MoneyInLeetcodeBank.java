package Basics;

public class MoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int count = 0;
        int totalMoney = 0;
        for (int i = 1;count <= n;i++){
           int sum  = i;
           for (int j = 1; j <= 7 ; j++) {
               totalMoney = totalMoney+ sum;
               sum++;
               count++;
               if (count == n)
                   return totalMoney;
           }
       }
       return totalMoney;
    }
    public static void main(String[] args) {
        System.out.println(totalMoney(4));

    }
}
