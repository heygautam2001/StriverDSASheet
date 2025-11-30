package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;

        // first for loop for iteration
        for (int i = 1; i < n ; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                // swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" element");
        int arr[] = new int[n];
        InputOutput.seekInput(arr);
        InputOutput.printArray(arr);
        insertionSort(arr);
        InputOutput.printArray(arr);

    }
}

/*
* 🔷 Insertion Sort – Explanation
Insertion Sort is a simple sorting algorithm that builds the sorted array one element at a time.

It works similar to how you sort playing cards in your hand:

You take one card at a time and insert it into the correct position among the cards already sorted.

🧠 How it works (Ascending Order):
Start with the second element (index 1).

Compare it with the elements before it.

Insert it into the correct position in the sorted part.

Repeat this process for all elements.

🔁 Insertion Sort Algorithm (Pseudocode)
text
Copy
Edit
for i = 1 to n - 1
    key = arr[i]
    j = i - 1

    while j >= 0 and arr[j] > key
        arr[j + 1] = arr[j]  // shift larger elements to the right
        j = j - 1

    arr[j + 1] = key  // insert the key into correct position
💡 Easy Example:
Let's sort [7, 3, 5, 2]

vbnet
Copy
Edit
Initial array: [7, 3, 5, 2]

i = 1, key = 3
  Compare 3 < 7 → shift 7 → [7, 7, 5, 2]
  Insert 3 at index 0 → [3, 7, 5, 2]

i = 2, key = 5
  Compare 5 < 7 → shift 7 → [3, 7, 7, 2]
  Compare 5 > 3 → stop
  Insert 5 at index 1 → [3, 5, 7, 2]

i = 3, key = 2
  Compare 2 < 7 → shift 7 → [3, 5, 7, 7]
  Compare 2 < 5 → shift 5 → [3, 5, 5, 7]
  Compare 2 < 3 → shift 3 → [3, 3, 5, 7]
  Insert 2 at index 0 → [2, 3, 5, 7]

Sorted array: [2, 3, 5, 7]
📌 Time Complexity:
Best Case: O(n) (already sorted)

Average Case: O(n²)

Worst Case: O(n²)

📌 Space Complexity: O(1) (in-place)
✅ Key Features:
Good for small or nearly sorted datasets

Simple and intuitive

Stable sort (maintains the relative order of equal elements)

Would you like the Java or Python code for this?

* */
