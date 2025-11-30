package GeeksForGeeks;

public class PrintPrime {

    public static boolean isPrime(int num){
        if(num ==1 )
            return false;
        int cnt = 1;
        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0 )
                cnt++;
        }
        if (cnt == 1)
            return true;
        return false;

    }
    public static void PrintPrime1toN(int num){
        for (int i = 1; i <= num ; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        PrintPrime1toN(15);
    }
}
