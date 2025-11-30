package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public  static void selectionSort(int []arr){
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            int minEleIndex = i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < arr[minEleIndex])
                    minEleIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minEleIndex];
            arr[minEleIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter "+size +" element : ");
       InputOutput.seekInput(arr);

        System.out.print("Unsorted array : ");
        InputOutput.printArray(arr);
        selectionSort(arr);
        System.out.print("sorted Array : ");
        InputOutput.printArray(arr);

    }
}

/*
* 🔷 Selection Sort – Explanation
Selection Sort is a simple comparison-based sorting algorithm.
It divides the input array into two parts:

The sorted part at the beginning.

The unsorted part at the rest.

It works by repeatedly selecting the smallest (or largest) element from the unsorted part and moving it to the sorted part.

🧠 How it works (Ascending Order):
Start from the first element.

Find the minimum element in the unsorted part of the array.

Swap it with the first element of the unsorted part.

Repeat this process for all elements, reducing the size of the unsorted part each time.

🔁 Selection Sort Algorithm (Pseudocode)
text
Copy
Edit
for i = 0 to n - 1
    minIndex = i
    for j = i + 1 to n - 1
        if arr[j] < arr[minIndex]
            minIndex = j
    swap arr[i] with arr[minIndex]
💻 Example:
Let's sort [29, 10, 14, 37, 13]

less
Copy
Edit
Initial array:       [29, 10, 14, 37, 13]

Step 1 (i=0):        Find min in [29,10,14,37,13] → 10
                     Swap 29 and 10 → [10, 29, 14, 37, 13]

Step 2 (i=1):        Find min in [29,14,37,13] → 13
                     Swap 29 and 13 → [10, 13, 14, 37, 29]

Step 3 (i=2):        Find min in [14,37,29] → 14
                     No swap needed → [10, 13, 14, 37, 29]

Step 4 (i=3):        Find min in [37,29] → 29
                     Swap 37 and 29 → [10, 13, 14, 29, 37]

Step 5 (i=4):        Already sorted.
Sorted array: [10, 13, 14, 29, 37]

📌 Time Complexity:
Best Case: O(n²)

Average Case: O(n²)

Worst Case: O(n²)

📌 Space Complexity: O(1) (in-place sort)
✅ Key Features:
Simple to implement

Not efficient for large datasets

Does not require extra memory

Performs well on small arrays

Would you like the Java or Python implementation as well?
* */