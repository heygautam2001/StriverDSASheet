package LinkedListDoubly;

import java.util.Stack;

public class ReverseDLL {
    public static void reverseDLL(ListNode head){
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            int val = st.pop();
            temp.val = val;
            temp = temp.next;
        }

    }
    // second approach by swapping the links...
    public static ListNode reverseDLLL(ListNode head) {
        if (head == null) return null;

        ListNode last = null;
        ListNode curr = head;

        while (curr != null) {
            last = curr.back;
            curr.back = curr.next;  // back now points forward
            curr.next = last;       // next now points backward
            curr = curr.back;       // advance using the newly swapped pointer
        }

        return last; // last non-null node visited = new head
    }

    // Function to reverse the doubly linked list
    public ListNode reverseDLLs(ListNode head) {

        // Pointer to traverse the list
        ListNode current = head;

        // Variable to eventually store new head after reversal
        ListNode last = null;

        // Traverse the entire list
        while (current != null) {

            // Swap next and back pointers of current node
            ListNode temp = current.next;
            current.next = current.back;
            current.back = temp;

            // Move last pointer to current (this will become new head)
            last = current;

            // Move to next node (originally current.next but now is back due to swap)
            current = temp;
        }

        // Return the new head (was the last node in original list)
        return last;
    }

}
