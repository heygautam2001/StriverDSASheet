package TwoPointerSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitIntoBasket {
    // Maximum length subarray with at most two types of number....
    public static int fruitIntoBasket(int[]arr){
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j =i; j < n; j++){
                set.add(arr[j]);
                if (set.size() <= 2){
                    maxLen = Math.max(maxLen, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }

    public static int fruitIntoBaskets(int[] fruits) {
        int n = fruits.length;
        // Left and right pointers for sliding window
        int l = 0;
        int r = 0;
        // Stores the maximum length of a valid window
        int maxLen = 0;
        // Map to store fruit type and its frequency in the current window
        Map<Integer, Integer> map = new HashMap<>();
        /*
     ALGORITHM:
     1. Start with an empty window [l, r]
     2. Expand the window by moving r to the right
     3. Add fruits[r] to the map and increase its count
     4. If the window has more than 2 distinct fruits:
        - Shrink the window from the left (move l)
        - Decrease count of fruits[l]
        - Remove fruit from map if its count becomes 0
     5. When window is valid (≤ 2 fruit types),
        update the maximum window length
     6. Repeat until r reaches the end of the array
     */
        // Expand window using right pointer
        while (r < n) {
            // Step 3: Include current fruit in the window
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            // Step 4: Shrink window until it becomes valid
            while (map.size() > 2) {
                // Remove the leftmost fruit from the window
                map.put(fruits[l], map.get(fruits[l]) - 1);
                // If count becomes zero, remove fruit type completely
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                // Move left pointer
                l++;
            }
            // Step 5: Update maximum length of valid window
            maxLen = Math.max(maxLen, r - l + 1);
            // Step 6: Move right pointer
            r++;
        }
        // Return the maximum number of fruits collected
        return maxLen;
    }
    public static void main(String[] args) {

    }
}
