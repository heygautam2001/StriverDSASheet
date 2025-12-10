package Array;

import java.util.HashMap;
import java.util.Map;

public class MaximumBallsInBox {
    public static int digitSum(int num){
        int temp = num;
        int sum = 0;
        while (temp != 0){
            sum = sum + temp%10;
            temp = temp/10;
        }
        return sum;
    }
    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer , Integer> mp = new HashMap<>();
        for (int i = lowLimit; i <= highLimit ; i++) {
            int sum = digitSum(i);
            if(!mp.containsKey(sum)){
                mp.put(sum , 1);
            }else{
                mp.put(sum,mp.get(sum)+1);
            }
        }

        int maxBalls = 0;
        for(int key : mp.keySet()){
            maxBalls = Math.max(maxBalls , mp.get(key));
        }
        return maxBalls;
    }

    // Second Solutions
    public static int countBall(int lowLimit, int highLimit) {
        Map<Integer , Integer> mp = new HashMap<>();
        for (int i = lowLimit; i <= highLimit ; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0){
                sum = sum + temp%10;
                temp = temp/10;

            }
            if(!mp.containsKey(sum)){
                mp.put(sum , 1);
            }else{
                mp.put(sum,mp.get(sum)+1);
            }
        }

        int maxBalls = 0;
        for(int key : mp.keySet()){
            maxBalls = Math.max(maxBalls , mp.get(key));
        }
        return maxBalls;
    }

    public static void main(String[] args) {
        System.out.println(countBall(19,28));
    }
}
