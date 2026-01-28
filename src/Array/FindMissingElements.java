package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements {
    // Leet-code 3731
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            min = Math.min(num,min);
            max = Math.max(num,max);
            set.add(num);
        }

        for(int i = min; i <= max; i++){
            if(set.add(i)){
                list.add(i);
            }
        }
        return list;

    }
}
