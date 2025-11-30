package Array;

public class ArrayBasics {
    public static void main(String[] args) {
        //Declaration
        int arr[];
        //initialization
        arr = new int[5]; //size validation

        //Entering data in array

        arr[0] = 1 ;
        arr[1] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[2] = 5;

        //Printing the values of array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //Declaration and initialization in the same line.
        int arr2[] = new int[10];
        System.out.println(arr2[0]); // Default element is 0

        arr2[0] = 12;
        arr2[1] = 11;
        //and so on we can fill that element.
        System.out.println(arr2[0]);
        System.out.println(arr[1]);
    }

}
