package Array;

public class SortArrayByParity {
    // Leet-code 921
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1)
            return nums;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
