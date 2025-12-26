package Array;

public class TypeOfTriangle {
    public String triangleType(int[] nums) {
        if(nums.length < 3)return "none";
        if(nums[0] + nums[1] < nums[2] ||
                nums[1]+nums[2] < nums[0] ||
                nums[2]+nums[0] < nums[1]
        ){
            return "none";
        }
        // Check for equilateral triangle
        if(nums[0] == nums[1] && nums[1] == nums[2])
            return "equilateral";

        if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
            return "isosceles";

        return "scalene";
    }
    public static void main(String[] args) {

    }
}
