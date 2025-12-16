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
    public static ListNode reverseDLL2(ListNode head){
        ListNode last  = null;
        ListNode curr = head;

        while ( curr != null){
          last = curr.back;
          curr.back = curr.next;
          curr.next = last;
          curr = curr.back;
        }
        return last.back;
    }

}
