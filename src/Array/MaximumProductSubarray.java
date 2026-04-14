package Array;
// You are given an array you have to find the subarray with maximum product
public class MaximumProductSubarray {
    // Brute
    public static int maximumProductSubarray(int [] arr){
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                for (int k = i; k <= j ; k++) {
                    prod = prod * arr[k];
                }
                maxProduct = Math.max(prod,maxProduct);
            }
        }
        return maxProduct;
    }
    // Better
    public static int maximumProductSubarrays(int [] arr){
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod = prod * arr[i];
                maxProduct = Math.max(prod,maxProduct);
            }
        }
        return maxProduct;
    }

    // Optimal solution
    public static int maximumProductsSubarray(int [] arr){
        int pref = 1;
        int suff = 1;
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pref == 0) pref = 1;
            if (suff == 0) suff = 1;
            pref = pref * arr[i];
            suff = suff * arr[n-i-1];
            ans = Math.max(ans , Math.max(pref,suff));

        }
        return ans;
    }


    public static void main(String[] args) {

    }

}
