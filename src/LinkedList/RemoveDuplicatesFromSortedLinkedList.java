package LinkedList;
// leet-code 83
public class RemoveDuplicatesFromSortedLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == temp.val){
                temp .next = temp.next.next;
            }
            if(temp.next == null )return head;
            if(temp.next.val != temp.val)
                temp = temp.next;
        }

        return head;

    }

//    ListNode current = head;
//
//        while (current != null && current.next != null) {
//        if (current.val == current.next.val) {
//            current.next = current.next.next;
//        } else {
//            current = current.next;
//        }
//    }
//
//        return head;
}
