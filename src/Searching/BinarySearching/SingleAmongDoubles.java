package Searching.BinarySearching;

public class SingleAmongDoubles {
    // Arrays is always sorted each element is repeated twice only one element is unique
    // Brute force

    public static int appearsOnce(int[]arr){
        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
           if(arr[i] != arr[i+1])

               return arr[i];
        }
        return 736438;
    }

    public static int findOnce(int[] arr){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0] != arr[1])return arr[0];
        if (arr[n-1] != arr[n-2]) return arr[n-1];
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];

            int f = mid , s = mid;
            if(arr[mid-1] == arr[mid]) f = mid-1;
            else s = mid+1;
            int leftCount = f - lo;
            int rightCount = hi-s;
            if(leftCount % 2 == 0) lo = s+1;
            else hi = f-1;

        }
        return 376483;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};
        System.out.println(appearsOnce(arr));
        System.out.println(findOnce(arr));
    }
}
