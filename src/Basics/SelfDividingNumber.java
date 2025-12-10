package Basics;

import java.util.ArrayList;
import java.util.List;
//leet-code 728
public class SelfDividingNumber {
    public static boolean isSelfDividing(int num){
        int temp = num;
        while(temp != 0){
            int x = temp % 10;
            if( x == 0 || num % x != 0 ){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1,22);
        System.out.println(list);
    }
}
