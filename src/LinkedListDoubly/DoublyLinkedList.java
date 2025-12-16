package LinkedListDoubly;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode back;

    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
        this.next = null;
        this.back = null;

    }

    public ListNode(int val , ListNode next , ListNode back){
        this.val = val;
        this.next = next;
        this.back = back;

    }


}

public class DoublyLinkedList {
    private static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static ListNode convertArrToDLL(int []arr){
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static ListNode deleteHead(ListNode head ){
        if (head == null || head.next == null){
            return null;
        }
        ListNode prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }
    public static ListNode deleteTail(ListNode head){
        if (head == null || head.next == null){
            return null;
        }

        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        ListNode newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }

    public static ListNode removeKthNode(ListNode head , int k){
        if (head == null){
            return null;
        }
        int cnt = 0;
        ListNode kNode = head;
        while(kNode != null){
            cnt++;
            if(cnt == k)break;
            kNode = kNode.next;
        }
        ListNode prev = kNode.back;
        ListNode front = kNode.next;

        if (prev == null && front == null){
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;

        kNode.next = null;
        kNode.back = null;

        return head;
    }
     public static void deleteNode(ListNode temp){
        ListNode prev = temp.back;
        ListNode front = temp.next;

        if (front == null){
            prev.next = null;
            temp.back = null;
            return ;
        }
        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;

     }

     // Insert Variation in doubly linked  list
    public static ListNode insertBeforeHead(ListNode head,int val){
        ListNode newHead = new ListNode(val,head,null);
        head.back = newHead;
        return newHead;
    }


    public static ListNode insertBeforeTail(ListNode head , int val){
        if (head.next != null){
            return insertBeforeHead(head,val);
        }

        ListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        ListNode prev = tail.back;
        ListNode newNode = new ListNode(val,tail,prev);
        prev.next = newNode;
        tail.back = newNode;

        return head;

    }

    public static ListNode insertBeforeKthNode(ListNode head ,int val, int k){
        if (k==1)
            return insertBeforeHead(head,val);
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }

        ListNode prev = temp.back;
        ListNode newNode = new ListNode(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;

    }


    public static void main(String[] args) {
        int []arr = {12,5,6,8};
        ListNode head = convertArrToDLL(arr);
        print(head);

//         head = deleteHead(head);
//         print(head);
//
//         head = deleteTail(head);
//         print(head);

//        head = removeKthNode(head,3);
//        print(head);
//        head = insertBeforeHead(head,11);
        print(head);
        ReverseDLL.reverseDLL(head);
        print(head);

    }
}
