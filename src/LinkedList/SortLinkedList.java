package LinkedList;

import java.util.ArrayList;

public class SortLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        list.sort(null);

        temp = head;
        while (temp != null && list.size() > 0) {
            temp.val = list.getFirst();
            list.removeFirst();
            temp = temp.next;

        }
        return head;

    }
    //======================================================================


    // Function to merge two sorted linked lists
    public Node mergeTwoSortedLinkedLists(Node list1, Node list2) {
        // Create a dummy node
        Node dummyNode = new Node(-1);

        // Temp pointer to build merged list
        Node temp = dummyNode;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            // Choose smaller node
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move temp pointer
            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        // Return head of merged list
        return dummyNode.next;
    }

    // Function to find middle of linked list
    public Node findMiddle(Node head) {
        // If list empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Slow and fast pointers
        Node slow = head;
        Node fast = head.next;

        // Move fast twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }

    // Function to perform merge sort
    public Node sortLL(Node head) {
        // Base case: empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle node
        Node middle = findMiddle(head);

        // Split into two halves
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        // Recursively sort both halves
        left = sortLL(left);
        right = sortLL(right);

        // Merge sorted halves
        return mergeTwoSortedLinkedLists(left, right);
    }

}
