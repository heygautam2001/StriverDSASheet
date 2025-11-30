package LinkedList;

public class LinkedList01 {
    static class  Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;

        }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"--->");
                temp = temp.next;
            }
            System.out.println();
        }
        public static int size(Node head){
            Node temp = head;
            int size = 0;
            while(temp!=null){
               size++;
               temp = temp.next;
            }
            return size;
        }
        public static boolean isEmpty(Node head){
            int size = size(head);
            if(size == 0)
                return true;
            return false;
        }

        public static void recDisplay(Node head){
            if(head.next == null){
                System.out.println(head.data);
                return;
            }
            System.out.print(head.data+" ");
            recDisplay(head.next);
        }
        public static void PrintRev(Node head){
            if(head == null){
                return;
            }
            PrintRev(head.next);
            System.out.print(head.data+" ");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b; // a--->b
        b.next = c; // a---->b---->c
        c.next = d; // a---->b--->c----->d
        d.next = e; // a---->b---->c---->d---->e;
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
//        Node.display(a);
//        System.out.println(" size "+Node.size(a));
//        System.out.println(Node.isEmpty(a));
//        Node.recDisplay(a);
//        Node.display(a);
          Node.PrintRev(a);
    }
}
