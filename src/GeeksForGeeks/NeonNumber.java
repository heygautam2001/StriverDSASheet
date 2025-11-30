package GeeksForGeeks;

public class NeonNumber {
    public static boolean isNeonNum(int num){
        int temp = num*num;
        int sum = 0;
        while(temp != 0){
            sum = sum + temp % 10;
            temp = temp/10;
        }

        return sum == num;

    }
    public static void main(String[] args) {
        System.out.println(isNeonNum(8));
    }
}
