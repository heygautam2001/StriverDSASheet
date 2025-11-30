package Searching.BinarySearching;

public class KokoEatingBanana {
    //==============================================================================
    // Brute force approach ---- TLE LeetCode
    // Function to calculate the total number of hours required
// to finish all banana piles if Koko eats at a fixed speed "hourly"
    public int totalHours(int []arr, int hourly) {
        int totalhrs = 0;       // keeps track of total hours needed
        int n = arr.length;     // total number of piles

        for (int i = 0; i < n; i++) {
            // For each pile, calculate how many full hours are needed.
            // Koko eats 'hourly' bananas per hour.
            // Math.ceil() is used so even if there's a remainder,
            // it counts as a full extra hour.
            // ⚠️ Note: In your code, integer division happens before Math.ceil(),
            // so it won’t give the correct result unless you cast to double.
            totalhrs += Math.ceil(arr[i] / hourly);
        }
        return totalhrs;        // return total time for all piles
    }


    // Function to find the maximum element in the array
// (i.e., the pile with the largest number of bananas)
    public int maxEle(int []arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;  // start with the smallest possible value

        for (int i = 0; i < n; i++) {
            // Update max whenever a larger pile is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;  // return the largest pile size
    }


    // Function to find the minimum eating speed such that
// Koko can finish all bananas within 'h' hours.
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size — this is the upper bound
        // for Koko's possible eating speed
        int max = maxEle(piles);

        // Try every possible speed from 1 banana/hour to 'max' bananas/hour
        for (int i = 1; i <= max; i++) {
            // For each possible speed, calculate total hours required
            int reqTime = totalHours(piles, i);

            // If the total required hours is within allowed time 'h',
            // that means Koko can finish eating at this speed.
            // Return this as the minimum speed (since we're checking in order).
            if (reqTime <= h) {
                return i;
            }
        }

        // If no speed satisfies the condition (shouldn't usually happen),
        // return -1 as an error or invalid result
        return -1;
    }


    // ===========================================================================
    // Optimized solution
    // Function to calculate total hours required for Koko to finish all piles
// at a given eating speed 'hourly'
    public int totalHrs(int[] arr, int hourly) {
        int totalhrs = 0;
        // Loop through each pile
        for (int pile : arr) {
            // Divide pile size by eating speed.
            // Use Math.ceil() so that even if the last hour has fewer bananas,
            // it still counts as a full hour.
            totalhrs += Math.ceil((double) pile / hourly);
        }
        // Return the total hours required for all piles
        return totalhrs;
    }


    // Function to find the largest number in the array (the biggest pile)
// This helps set the upper bound for our binary search range.
    public int maxiEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }


    // Function to find the minimum eating speed such that Koko can finish
// all banana piles within 'h' hours using binary search.
    public int minEatingSpeeds(int[] piles, int h) {

        // Step 1: Define the search boundaries
        // Minimum possible speed = 1 (at least one banana per hour)
        // Maximum possible speed = size of the largest pile
        int left = 1;
        int right = maxiEle(piles);
        int ans = right; // store potential answer (start with upper bound)

        // Step 2: Binary search between left and right
        while (left <= right) {

            // Find the middle speed
            int mid = left + (right - left) / 2;

            // Step 3: Calculate how many hours Koko needs at this speed
            int reqTime = totalHrs(piles, mid);

            // Step 4: Check if she can finish within 'h' hours
            if (reqTime <= h) {
                // ✅ If yes, this speed works — but maybe she can eat slower.
                // Store the current speed as a possible answer.
                ans = mid;

                // Move to the left half to check if a smaller speed also works.
                right = mid - 1;
            } else {
                // ❌ If no, she needs to eat faster.
                // Move to the right half to try higher speeds.
                left = mid + 1;
            }
        }

        // Step 5: When the loop ends, 'ans' holds the smallest valid speed.
        return ans;
    }


    public static void main(String[] args) {

    }
}
