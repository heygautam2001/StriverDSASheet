package TwoPointerSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        // Array to store frequency of each character (A-Z)
        int[] freq = new int[26];
        // Two pointers for sliding window
        int left = 0;
        int right = 0;

        // Stores the maximum frequency of any character in the current window
        int maxFreq = 0;

        // Stores the maximum valid window length
        int maxLength = 0;

        // Expand the window using right pointer
        while (right < s.length()) {

            // Step 1: Include the current character in the window
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // Step 2: Update the maximum frequency in the window
            maxFreq = Math.max(maxFreq, freq[index]);

            // Step 3: Check if the window is invalid
            // (window size - max frequency > k means more than k replacements needed)
            while ((right - left + 1) - maxFreq > k) {

                // Step 4: Shrink the window from the left
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Step 5: Update the maximum length of a valid window
            maxLength = Math.max(maxLength, right - left + 1);

            // Step 6: Move the right pointer forward
            right++;
        }

        // Step 7: Return the longest valid window length
        return maxLength;
    }

    public int characterReplacements(String s, int k) {
        int r=0,l=0;
        int maxlen=0;
        int maxfreq=0;
        Map<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));
            if((r-l+1)-maxfreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                // maxfreq=0;
                // for(char c:map.keySet()){
                //     maxfreq=Math.max(maxfreq,map.get(c));
                // }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k)); // Output: 4
    }
}

