package LinkedList;

public class DoubleANumber {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    // Pass leet-code 842 testcases
    public ListNode doubleIt(ListNode head) {

        if (head.val == 0 && head.next == null) {
            return head;
        }

        ListNode temp = head;
        int num = 0;
        while(temp != null){
            num = num * 10 + temp.val;
            temp = temp.next;
        }

        num = num*2;
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num % 10;
            num = num/10;
        }

        ListNode temp2 = new ListNode(-1);
        temp = temp2;
        while(rev != 0){
            ListNode node = new ListNode(rev%10);
            temp.next = node;
            temp = node;
            rev = rev /10;
        }
        return temp2.next;
    }
    // Optimized solution
    // Reverses a singly linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Doubles the number represented by the linked list
    public static ListNode doubledIt(ListNode head) {

        // Step 1: Reverse the list to process from least significant digit
        head = reverseList(head);

        int carry = 0;
        ListNode curr = head;

        // Step 2: Multiply each digit by 2 and manage carry
        while (curr != null) {
            int sum = curr.val * 2 + carry;
            curr.val = sum % 10;
            carry = sum / 10;


            curr = curr.next;
        }
        // If carry remains, add it as a new most significant digit
        if (carry > 0) {
            head = reverseList(head);
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            return newHead;
        }
        // Step 3: Reverse back to restore original order
        return reverseList(head);
    }
    public static void main(String[] args) {

    }
}
