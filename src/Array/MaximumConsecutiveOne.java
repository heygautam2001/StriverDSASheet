package Array;

import java.util.Scanner;

public class MaximumConsecutiveOne {

    public static int maxConsecutiveOneXX(int arr[]){
        int n = arr.length;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;
            }else {
                if(i == n-1 || count > maxCount){
                    maxCount = count;
                    count = 0;
                }
            }

        }

        return maxCount;
    }
    public static int maxConsecutiveOne(int arr[]) {
        int n = arr.length;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(count , maxCount);

            }else{
                count = 0;
            }
        }
        return  maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size if an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxConsecutiveOne(arr));
    }
}
