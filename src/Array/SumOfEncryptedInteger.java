package Array;

public class SumOfEncryptedInteger {
    public static int sumOfEncryptedInt(int[] arr){
        int n = arr.length;
        int sumOfEnc = 0;
        for (int i = 0; i < n; i++) {

            // checks for zero...
            if(arr[i] == 0){
                sumOfEnc = sumOfEnc + arr[i];
                continue;
            }
            int x = arr[i];
            int maxEle = 0;
            int digitCount = 0;

            // find out the maximum element in digit x and also count the no.of digit....
            while (x != 0){
                maxEle = Math.max(maxEle,x%10);
                digitCount++;
                x=x/10;
            }
            int enc = 0;
            while (digitCount != 0){
                enc = enc*10 + maxEle;
                digitCount--;
            }
            sumOfEnc = sumOfEnc + enc;
        }
        return sumOfEnc;
    }
    public static void main(String[] args) {
        int []arr = {10,21,31};
        System.out.println(sumOfEncryptedInt(arr));
    }
}
