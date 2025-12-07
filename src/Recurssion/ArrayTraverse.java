package Recurssion;

public class ArrayTraverse {
    public static void traverseArray(int[]arr , int idx){
        if(idx >= arr.length)
            return;
        System.out.print(arr[idx]+" ");
        traverseArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,9,7,8};
        traverseArray(arr,0);
    }
}
