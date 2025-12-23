package TwoPointerSlidingWindow;
// Count the number of substring containing all three character
public class SubstringContainingAllThreeCharacter {
    // String = "bbacba";
    public static int substringContainingAllThreeCharacter(String str){
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int [] hash = new int[3];
            for (int j = i; j < n; j++) {
                hash[str.charAt(j) - 'a'] = 1;
                if(hash[0]+ hash[1]+hash[2] == 3){
                    count = count +1;
                }

            }
        }
        System.out.println("Total count"+count);
        return  count;
    }

    public static int numberOfSubstrings(String s) {

        // Step 1: Initialize variables
        int n = s.length();
        int[] count = new int[3]; // count[0] -> 'a', count[1] -> 'b', count[2] -> 'c'
        int left = 0;
        int right = 0;
        int result = 0;

        // Step 2: Use sliding window with two pointers
        while (right < n) {

            // Step 3: Include current character at 'right' into the window
            count[s.charAt(right) - 'a']++;

        /*
         Step 4:
         If the current window contains at least one 'a', 'b', and 'c',
         then:
         - All substrings starting from 'left' and ending at
           'right', 'right+1', ..., 'n-1' are valid
         - So we add (n - right) to the result
        */
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {

                // Count valid substrings
                result += n - right;

                // Step 5: Shrink the window from the left
                count[s.charAt(left) - 'a']--;
                left++;
            }

            // Step 6: Move right pointer forward to expand window
            right++;
        }

        // Step 7: Return total count of valid substrings
        return result;
    }


    public static void main(String[] args) {

    }
}
