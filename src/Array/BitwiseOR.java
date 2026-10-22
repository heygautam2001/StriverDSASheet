package Array;

public class BitwiseOR {
    public static int[] adjacentBitwiseOR(int[] nums){
        int n = nums.length;;
        int [] ans = new int[n];
        for (int i = 0; i < n-1; i++) {
            ans[i] = nums[i] | nums[i+1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int[] result = adjacentBitwiseOR(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
