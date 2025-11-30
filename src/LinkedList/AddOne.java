package LinkedList;

import TreeDs.TreeNode;

public class AddOne {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = null;
        while(curr!= null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public static ListNode addOne(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        int carry = 1;
        while (temp != null) {
            temp.val = temp.val + carry;
            if (temp.val < 10) {
                carry = 0;
                break;
            } else {
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;

        }
        head = reverse(head);
        return head;
    }
        public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(9);
        a.next = b;
        b.next = c;
        c.next = null;
        ListNode x = addOne(a);
        ListNode temp = x;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}
