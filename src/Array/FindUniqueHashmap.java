package Array;

import java.util.HashMap;

public class FindUniqueHashmap {
    public static HashMap<Integer , Integer> findUnique(int arr[]){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,2,5,5};
        HashMap<Integer , Integer> mp = findUnique(arr);
        System.out.println(mp);

        for(int key : mp.keySet() ){
//            System.out.println(mp.get(key));
            if(mp.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
