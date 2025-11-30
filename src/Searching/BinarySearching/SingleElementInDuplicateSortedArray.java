package Searching.BinarySearching;

public class SingleElementInDuplicateSortedArray {
    public static int singleNonDuplicate(int[] arr) {

        int n = arr.length;
        if(n==1) return arr[0];
        for(int i = 0; i < n; i++){
            if(i==0){
                if(arr[i] != arr[i+1])return arr[i];
            }else if(i == n-1){
                if(arr[i] != arr[i-1])return arr[i];
            }else{
                if(arr[i]!= arr[i+1] && arr[i] != arr[i-1])
                    return arr[i];
            }
        }
        return -1;
    }
//    ================================================================
    public int singleNonDuplicates(int[] arr) {
        int n = arr.length;

        // 🧩 Base cases: handle small arrays or edge elements

        // Case 1: If there's only one element, it's the single one
        if (n == 1) return arr[0];

        // Case 2: If the first element is different from the second, it's the single one
        if (arr[0] != arr[1]) return arr[0];

        // Case 3: If the last element is different from the second last, it's the single one
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];


        // 🔍 Binary Search between index 1 and n-2
        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            // ✅ Check if arr[mid] is the unique element
            // It should not be equal to either its left or right neighbor
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // 🧠 Key Insight:
            // In a sorted array where every element appears twice except one,
            // pairs appear at indices:
            //   - (even, odd) before the single element,
            //   - (odd, even) after the single element.
            //
            // Example: [1,1,2,2,3,4,4,5,5]
            //                     ↑ single = 3

            // 🔸 If mid is odd and equals its previous → left side is valid, move right
            // 🔸 If mid is even and equals its next → left side is valid, move right
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;   // search in the right half
            }
            else {
                high = mid - 1;  // search in the left half
            }
        }

        // 🚫 If no element found (theoretically shouldn’t happen for valid input)
        return -1;
    }

    public static void main(String[] args) {

    }
}
