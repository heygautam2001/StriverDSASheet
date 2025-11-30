package LinkedList;

public class RotateLinkedList {
    public static class ListNode{
        int val ;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }

    }
    ListNode findNthNode(ListNode temp , int k){
        int cnt = 1;
        while(temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k ==0 )return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        if(k % len == 0) return head;
        k = k % len;

        tail.next = head;
        ListNode newLastNode = findNthNode(head,len-k);

        head = newLastNode.next;
        newLastNode.next = null;

        return head;

    }

    public static void main(String[] args) {

    }
}
