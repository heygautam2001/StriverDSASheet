package GeeksForGeeks;

public class HappyNumber {
    public static int digitSqrSum(int num){
        int sum = 0;
        while(num != 0){
            int digit = num%10;
            sum = sum+ digit*digit;
            num = num/10;
        }
        return sum;
    }

    public static boolean isHappy(int num ){
        if (num==1 || num == 7)return true;
        if(num < 10)return false;

        while(num > 0){
            int sum = digitSqrSum(num);
            System.out.println(sum);
            if (sum == 1){
                return true;
            }else{
               num = sum;
            }
        }
        return false;
    }
    public static boolean isHappyNumber(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappyNumber(sum);
        }
    }
    public static void main(String[] args) {
//        System.out.println(isHappy(11));
        System.out.println(isHappyNumber(11));
    }
}
