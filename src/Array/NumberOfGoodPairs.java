package Array;

import java.util.HashMap;
import java.util.Map;
// 1512
public class NumberOfGoodPairs {

        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                if (map.containsKey(num)) {
                    count += map.get(num); // add previous occurrences
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return count;
        }

    public static void main(String[] args) {

    }
}
