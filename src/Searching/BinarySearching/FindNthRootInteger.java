package Searching.BinarySearching;

public class FindNthRootInteger {
    // Find the nth root of M (x**n == m)
    public static int findNthRootOfM(int n, int m) {

        for (int i = 1; i <= m; i++) {

            int x = 1;

            for (int j = 1; j <= n; j++) {
                x = x * i;
            }

            if (x == m) {
                return i;
            }

            if (x > m) {
                break;
            }
        }

        return -1;
    }
    public static int func(int mid , int n , int m){
        long ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static int findNthRootM(int n, int m){
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high-low)/2;
            int midn = func(mid,n,m);
            if(midn == 1){
                return mid;
            } else if (midn == 0) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findNthRootOfM(3,27));
    }
}
