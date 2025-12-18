package StringsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {

        // StringBuilder to build the final result
        StringBuilder sb = new StringBuilder();

        // Bucket array where index = frequency
        // Each bucket stores characters that appear 'index' times
        List<Character>[] arr = new ArrayList[s.length() + 1];

        // Step 1: Count frequency of each character
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Place characters into buckets based on frequency
        for (char c : map.keySet()) {
            int freq = map.get(c);

            // Initialize bucket if not already created
            if (arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }

            // Add character to its frequency bucket
            arr[freq].add(c);
        }

        // Step 3: Build result string from highest frequency to lowest
        for (int i = arr.length - 1; i > 0; i--) {

            // If bucket is not empty
            if (arr[i] != null) {

                // For each character with frequency i
                for (char c : arr[i]) {

                    // Append character 'i' times
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

        // Step 4: Return the final sorted string
        return sb.toString();
    }

    public static void main(String[] args) {

    }

}
