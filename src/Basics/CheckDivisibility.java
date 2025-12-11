package Basics;
//leet-code 3622
public class CheckDivisibility {
    public static boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        if(n == 0)
            return true;
        temp = Math.abs(temp);
        while(temp != 0){
            sum = sum + temp%10;
            product = product * (temp%10);
            temp = temp/10;
        }
        long sumProduct = sum + product;
        return sumProduct != 0 && (n % sumProduct == 0);
    }
    public static void main(String[] args) {
        System.out.println(checkDivisibility(23));
    }
}
