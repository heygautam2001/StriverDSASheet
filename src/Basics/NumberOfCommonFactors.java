package Basics;

public class NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        int numberOfFactor = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0)
                numberOfFactor++;

        }
        return numberOfFactor;
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(16,8));
    }
}
