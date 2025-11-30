package Array;

public class FindUnique {
    public static int findUnique(int arr[]  ){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] >-1)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1 , 1, 4 , 3 , 3 , 2 , 2};
        System.out.println(findUnique(arr));
    }
}
