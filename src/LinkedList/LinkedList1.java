package LinkedList;

public class LinkedList1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayRec(Node head){
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    public static void displayReverse(Node head){
        if (head == null) {
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;

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
        display(a);
//        Node x = reverseList(a);
//        display(x);
        displayRec(a);
        System.out.println();
        displayReverse(a);


    }
}
