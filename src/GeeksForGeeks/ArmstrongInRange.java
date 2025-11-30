package GeeksForGeeks;

public class ArmstrongInRange {
    public static boolean isArmstrong(int num){
        int digitCount = 0;
        int temp = num;
        while(temp != 0){
            digitCount++;
            temp = temp /10;
        }
        temp = num;
       boolean armstrong = false;
       int sum = 0;
       while(temp != 0){
           sum = sum + (int)(Math.pow(temp % 10 , digitCount));
           temp = temp /10;
       }

       if (sum == num)
           armstrong = true;
       else
           armstrong = false;

       return armstrong;
    }

    public static int checkArmstrongInRange(int r1 , int r2 ){
        for (int i = r1; i <= r2 ; i++) {
            if(isArmstrong(i))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
        System.out.println(checkArmstrongInRange(100,200));
    }
}
