package Recurssion;
// return the count of the subsequence sum if sum == k;
public class SubsequenceSumIII {
    public static int countSubsequenceSumK(int idx , int sum , int[]arr, int k){
        int n = arr.length;
        if(sum > k)return 0;
        if(idx == n){
            // if sum == k , then found solution so return the 1;
            if(sum == k){
                return 1;
            }
            //else return 0;
            return 0;
        }
        //pick the value at idx...
        sum = sum+arr[idx];
        int l = countSubsequenceSumK(idx+1,sum,arr,k);

        // Not pick
        sum = sum-arr[idx];
        int r = countSubsequenceSumK(idx+1,sum,arr,k);
        return l+r;

    }
    public static void main(String[] args) {
       int[] arr = {1,2,1};
        System.out.println(countSubsequenceSumK(0,0,arr,2));
    }
}
