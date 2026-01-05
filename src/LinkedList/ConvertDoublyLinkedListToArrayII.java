package LinkedList;

import java.util.ArrayList;
// leet-code 3294
public class ConvertDoublyLinkedListToArrayII {
    static class Node{
        int val;
        Node next;
        Node prev;
       public Node(int val){
            this.val = val;
        }
//        Algorithm
//        If input node is null, return empty array
//        Move left using prev until you reach the head
//        Traverse forward using next
//        Store values in a list
//        Convert list to array and return
       public static int[] toArray(Node node) {
          // If input node is null, return empty array
           if (node == null) return new int[0];

//         Move left using prev until you reach the head
           while (node.prev != null) {
               node = node.prev;
           }

//         Traverse forward using next
//         Store values in a list
           ArrayList<Integer> list = new ArrayList<>();
           while (node != null) {
               list.add(node.val);
               node = node.next;
           }

//         Convert list to array and return
           int[] ans = new int[list.size()];
           int i = 0;
           for (int ele : list) {
               ans[i++] = ele;
           }
           return ans;
       }

    }
}
