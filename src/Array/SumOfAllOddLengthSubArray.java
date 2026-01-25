package Array;
// Leet-code 1588
public class SumOfAllOddLengthSubArray {
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n ; i++){
            for(int j = i; j<n; j++){
                if((j-i+1)%2 > 0){
                    for(int k = i; k <= j; k++){
                        sum = sum+arr[k];
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
      int [] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
