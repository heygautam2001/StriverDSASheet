package Array;

import java.util.Arrays;
import java.util.List;

public class HeightChecker {
    public int heightCheckers(int[] heights) {
        List<Integer> expected = Arrays.stream(heights).sorted().boxed().toList();
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected.get(i))count++;
        }
        return count;
    }

    public static int heightChecker(int []height){
        int [] expected = Arrays.copyOf(height,height.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i]!= expected[i])count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
