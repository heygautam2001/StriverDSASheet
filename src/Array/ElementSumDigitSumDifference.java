package Array;

public class ElementSumDigitSumDifference {
    public static int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elementSum = 0;
        for(int ele : nums){
            elementSum = elementSum + ele;
        }

        int digitSum = 0;
        for(int num : nums){
            int sum = 0;
            while(num != 0){
                sum = sum+num%10;
                num = num/10;
            }
            digitSum = digitSum + sum;
        }
        return Math.abs(elementSum-digitSum);
    }
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{}));
    }
}
