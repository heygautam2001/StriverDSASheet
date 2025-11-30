package LinkedList;
// search an element in linked list...
public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =  data;
        }
    }
    // search an element in the linked list
    public static boolean searchEle(Node head , int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target)
                return true;
            temp = temp.next;
        }

        return false;
    }
    // Reverse the linked list by recursion.
    public static Node reverseLL(Node head){
        if(head.next == null)
            return head ;
       Node x =  reverseLL(head.next);
        head.next.next = head;
        head.next = null;

        return x;
    }
    //Calculating the size of the linked list.
    public static int size(Node head){
        Node temp = head;
        int sizes = 0;
        while(temp != null) {
            sizes++;
            temp = temp.next;
        }
        return sizes;
    }

    // Delete Nth Node from last
    // nth node from last (Nth) = size - N Node from start.

    public static Node deleteNthNodeFromLast(Node head , int n){
        Node temp = head;
        if (head == null)
            return null;
        int sizeLL = size(head);
        // calculate Node to be deleted from start
       int NodeFromSt = sizeLL - n;
       if(n == sizeLL) {
           head = head.next;
           return head;
       }
       temp = head;

        for (int i = 1; i < NodeFromSt ; i++) {
            temp = temp.next;
        }
       Node x = temp.next;
        temp.next = temp.next.next;
        x.next = null;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(14);
        Node e = new Node(15);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
//        System.out.println(searchEle(a , 12));
//        Node x = reverseLL(a);
        display(a);
       System.out.println();
       Node x = deleteNthNodeFromLast(a,1);
       display(x);

    }

}
