package Searching.BinarySearching;

public class SquareRoot {

    public static int sqrtRoot(int n){
        int ans = 1;
        for (int i = 1; i <= n/2 ; i++) {
            if (i*i <= n){
                ans = i;
            }
        }
        return ans;
    }

    public static int findSquareRoot(int num){
        int st = 0;
        int end = num;
        int mid = -1;
        while(st <= end){
            mid = st + (end-st)/2;
            if (mid*mid == num){
                return mid;
            } else if (mid*mid > num) {
                end = mid-1;
            }else{
                st = mid+1;
            }

        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(findSquareRoot(200));
        System.out.println(sqrtRoot(15));
    }
}
