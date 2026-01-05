package LinkedList;

import extras.multiThreading.A;

import java.util.ArrayList;
import java.util.Arrays;

// leet-code 3263
public class ConvertDoublyLinkedListToArrayI {
    static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public static int[] toArray(Node head){
            Node temp = head;
            ArrayList<Integer> list = new ArrayList<>();
            while(temp != null){
                list.add(temp.val);
                temp = temp.next;
            }

            int[] ans = new int[list.size()];
            int i = 0;
            for(int ele : list){
                ans[i++] = ele;
            }
            return ans;
        }
    }
}
