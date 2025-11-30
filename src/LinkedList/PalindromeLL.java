package LinkedList;

import java.util.Stack;

public class PalindromeLL {
    public static class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    public static boolean isPalindrome(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val != st.peek().val) return false;
            temp = temp.next;
            st.pop();


        }
        return true;
    }

    public static Node reverse(Node head){
        if (head == null || head.next == null)
            return head;

        Node x = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return x;
    }

    public static boolean isPalindromeList(Node head){
        // 1. find the middle of the linked list
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the half of the linked list from slow.next to null.
        Node newHead = reverse(slow.next);
        Node first = head , second = newHead;

        // compare the data int the nodes
        while (second != null){
            if (first.val != second.val){
                reverse(newHead); // Move back the reverse list into original orientation.
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead); // Move back the reverse list into original orientation.
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(12);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(isPalindrome(a));
//        Node x = reverse(a);
//        Node temp = x;
//        while (temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
        System.out.println(isPalindromeList(a));
    }
}
