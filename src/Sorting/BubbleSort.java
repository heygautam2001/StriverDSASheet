package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void bubbleSort(int[]arr ,int  n){

        for (int i = 1; i < n ; i++) {

        }
        bubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" element : ");
       InputOutput.seekInput(arr);

        InputOutput.printArray(arr);
        bubbleSort(arr , arr.length);
        InputOutput.printArray(arr);
    }
}

/*
🔷 Bubble Sort – Explanation
Bubble Sort is a simple comparison-based sorting algorithm.
It repeatedly swaps adjacent elements if they are in the wrong order.
This process is repeated until the list is sorted.

It’s called “bubble” sort because larger elements “bubble up” to the end of the array with each pass.

🧠 How it works (Ascending Order):
Start from the beginning of the array.

Compare the current element with the next one.

If the current element is greater than the next, swap them.

Repeat this process for the entire array.

After one pass, the largest element is at the end.

Repeat the process for the remaining unsorted portion of the array.

🔁 Bubble Sort Algorithm (Pseudocode)
text
Copy
Edit
for i = 0 to n - 1
    for j = 0 to n - i - 2
        if arr[j] > arr[j + 1]
            swap arr[j] and arr[j + 1]
✅ Optional Optimization: Stop the algorithm if no swaps occurred in a full pass (array is already sorted).

💻 Example:
Let’s sort [5, 3, 8, 4, 2]

yaml
Copy
Edit
Pass 1:
  Compare 5 & 3 → swap → [3, 5, 8, 4, 2]
  Compare 5 & 8 → no swap
  Compare 8 & 4 → swap → [3, 5, 4, 8, 2]
  Compare 8 & 2 → swap → [3, 5, 4, 2, 8]

Pass 2:
  Compare 3 & 5 → no swap
  Compare 5 & 4 → swap → [3, 4, 5, 2, 8]
  Compare 5 & 2 → swap → [3, 4, 2, 5, 8]

Pass 3:
  Compare 3 & 4 → no swap
  Compare 4 & 2 → swap → [3, 2, 4, 5, 8]
  Compare 4 & 5 → no swap

Pass 4:
  Compare 3 & 2 → swap → [2, 3, 4, 5, 8]

Sorted array: [2, 3, 4, 5, 8]
📌 Time Complexity:
Best Case: O(n) (when array is already sorted with optimization)

Average Case: O(n²)

Worst Case: O(n²)

📌 Space Complexity: O(1) (in-place sort)
✅ Key Features:
Easy to implement

Inefficient for large datasets

Can be optimized with a flag to detect sorted arrays


 */