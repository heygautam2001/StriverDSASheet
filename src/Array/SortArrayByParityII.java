package Array;

public class SortArrayByParityII {
    //Leet-code 922
    public int[] sortTheArrayByParityII(int[] nums) {
        int[]ans = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                ans[k] = nums[i];
                k = k+2;
            }
        }

        k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                ans[k] = nums[i];
                k = k+2;
            }
        }
        return ans;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while(i < nums.length && j < nums.length){
            if(i % 2 == 0 && nums[i]%2 == 0){
                i = i+2;
            }else if(j%2 == 1 && nums[j]%2 == 1){
                j = j+2;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i = i+2;
                j=j+2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
