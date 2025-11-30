package LinkedList;

public class MiddleOfLinkedList {
   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node middleOfLinkedList(Node head){
       Node slow = head;
       Node fast = head;
       if (head == null && head.next == null)
           return head;
       while(fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(middleOfLinkedList(a).data);

   }

}
