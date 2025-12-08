package Basics;
//Leet-code 1822
public class SignFunction {
    public static int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) sign = -sign;
        }

        return sign;
    }
    public static void main(String[] args) {
       int [] arr ={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(arr));
    }
}
