package LinkedList;

import extras.multiThreading.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLinkedList
{
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public static ArrayList<Integer> mergeLinkedList(ListNode head1, ListNode head2){
            ArrayList<Integer> list = new ArrayList<>();
            ListNode temp1 = head1;
            ListNode temp2 = head2;
            while(temp1 != null){

                list.add(temp1.val);
                temp1 = temp1.next;
            }

            while (temp2 != null){
                list.add(temp2.val);
                temp2 = temp2.next;

            }
            return list;
        }
    }

    // ==========================================================================

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode h = new ListNode(4);
        ListNode t = h;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null)
            t.next = t2;

        else
            t.next = t1;

        return h.next;
    }

}
