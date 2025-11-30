package Array;

import java.util.Arrays;

public class ArrangePositiveNegativeNumber {
    public static void sortPositiveNegative(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while(arr[i] >= 0) i++;
            for (int j = i+1; j < n ; j++) {

               if(arr[j] >= 0){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
//                   System.out.println(Arrays.toString(arr));
                   int temp2 = arr[i+1];
                   arr[i+1] = arr[j];
                   arr[j] = temp2;
//                   System.out.println(Arrays.toString(arr));
                   break;
               }

            }
        }
    }

//    public static void sortNegativePositive(int arr[]){
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            while(arr[i] < 0) i++;
//            for (int j = i+1; j < n ; j++) {
//
//                if(arr[j] < 0){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                   System.out.println(Arrays.toString(arr));
//                    int temp2 = arr[i+1];
//                    arr[i+1] = arr[j];
//                    arr[j] = temp2;
//                   System.out.println(Arrays.toString(arr));
//                    break;
//                }
//
//            }
//        }
//    }

    public static void sortArray(int arr[]){
        int n = arr.length;
        int []ans = new int[n];
        int j = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] >= 0){
                ans[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                ans[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int []arr = {-8,-5,4,-3,0,-2,7,-9};
       System.out.println(Arrays.toString(arr));
//        sortPositiveNegative(arr);
//        sortNegativePositive(arr);
//        System.out.println(Arrays.toString(arr));
        sortArray(arr);
    }
}
