package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumII {
   static boolean flag = false;
    public static void printSubsequenceSum(int idx, int sum, int[]arr, List<Integer>list, int k){
       int n = arr.length;
        if(idx == n){
            if(sum == k && flag == false){
                flag = true;
                for(var ele : list){
                    System.out.print(ele+" " );
                }
            }
            return;
        }

        //pick the element;
        list.add(arr[idx]);
        sum = sum + arr[idx];
        printSubsequenceSum(idx+1,sum,arr,list,k);

        // Not pick...
        sum = sum - arr[idx];
        list.remove(list.size()-1);
        printSubsequenceSum(idx+1,sum,arr,list,k);
    }
    public static boolean printS(int idx, int sum, int[]arr, List<Integer>list, int k){
        int n = arr.length;
        if(idx == n){
            if(sum == k && flag == false){
                for(var ele : list){
                    System.out.print(ele+" " );
                }
                return true;
            }
            return false;
        }
        //pick ....
        list.add(arr[idx]);
        sum += arr[idx];
       if(printS(idx+1,sum, arr,list,k)){
           return true;
       }

       list.remove(list.size()-1);
       sum -= arr[idx];
        if(printS(idx+1,sum, arr,list,k)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1,2,1};
        int k = 2;
        List<Integer> list = new ArrayList<>();
//        printSubsequenceSum(0,0,arr,list , k);
        System.out.println(printS(0,0,arr,list , k));

    }
}
