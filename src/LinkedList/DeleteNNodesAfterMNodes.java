package LinkedList;
// leet-code 1474
public class DeleteNNodesAfterMNodes {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteNode(ListNode head , int m , int n) {
        if(head == null) return null;
        if(m == 0) return null;
        if(n == 0) return head;

        ListNode curr = head;
        while (curr != null){
            for (int i = 1; i < m && curr != null ; i++) {
                curr = curr.next;
            }
            if(curr == null) break;
            ListNode temp = curr.next;

            for (int i = 0; i < n && temp != null ; i++) {
                temp = temp.next;
            }
             curr.next = temp;
            curr = temp;
        }

       return head;
    }

    // Helper: create linked list from array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example test case
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 2;
        int n = 3;

        ListNode head = createList(values);

        System.out.print("Original List: ");
        printList(head);

        head = deleteNode(head, m, n);

        System.out.print("Modified List: ");
        printList(head);

    }
}
