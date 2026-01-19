package BitManipulation;

public class SingleNumberI {
    // leet-code 136
    public static int singleNumber(int[] arr){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,3,4,4}));
    }
}
