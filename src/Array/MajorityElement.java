package Array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int majority =  Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
            }
            if(majority == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }
    public static void main(String[] args) {


    }
}
