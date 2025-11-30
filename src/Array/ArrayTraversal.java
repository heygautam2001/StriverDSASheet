package Array;

public class ArrayTraversal {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 1;
        arr[3] = 7;
        arr[2] = 9;
        arr[4] = 5;

        for (int i = 0; i < 5; i++) {

            System.out.println(arr[i]);
        }

        System.out.println();
        //taking size of an array with size method

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
