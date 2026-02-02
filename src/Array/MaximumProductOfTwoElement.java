package Array;
// Not correct solution
public class MaximumProductOfTwoElement {
    public  static int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
//            }else{
//                secondMax = num;
           }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        return (firstMax-1) * (secondMax-1);
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,5,4,5}));
    }
}
