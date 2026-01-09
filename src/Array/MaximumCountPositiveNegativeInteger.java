package Array;
// leet-code 2529
public class MaximumCountPositiveNegativeInteger {
    public static int maximumCount(int[] nums) {
        int positiveElement = 0;
        int negativeElement = 0;
        for (int num : nums) {
            if (num > 0) positiveElement++;
            if (num < 0) negativeElement++;
        }
        return Math.max(positiveElement, negativeElement);
    }
    public static void main(String[] args) {

    }
}
