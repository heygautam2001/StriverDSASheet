package Recurssion;

public class SumOfNNaturalNum {
    private static int SumOfNaturalNum(int n){
        if (n == 0)
            return 0;
        int currentNum = n;
        int prevNum = SumOfNaturalNum(n-1);
        int sum = currentNum + prevNum;
        return sum;
//        return n + SumOfNaturalNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumOfNaturalNum(5));
    }
}
