package Array;
//leet-code 3090
public class MinimumOperationDivisibility {
    public static int minimumOperations(int[]nums) {
        int operationCount = 0;
        for(int ele : nums){
            if(ele % 3 != 0){
                operationCount++;
            }
        }
        return operationCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(minimumOperations(arr));
    }
}
