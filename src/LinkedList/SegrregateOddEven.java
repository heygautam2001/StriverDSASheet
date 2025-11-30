package LinkedList;

import java.awt.event.TextEvent;
import java.util.ArrayList;

public class SegrregateOddEven {
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
        Node temp = a;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
        Node x = Node.segregateEvenOdd(a);

        while (x != null) {
            System.out.print(x.data + "->");
            x = x.next;
        }

    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public static Node segregateOddEven(Node head) {
            ArrayList<Integer> arr = new ArrayList<>();
            Node temp = head;
            if (head == null || head.next == null) {
                return head;
            }
            while (temp != null && temp.next != null) {
                arr.add(temp.data);
                temp = temp.next.next;
            }

            if (temp != null && temp.next == null) arr.add(temp.data);


            temp = head.next;

            while (temp != null && temp.next != null) {
                arr.add(temp.data);
                temp = temp.next.next;

            }
            if (temp != null && temp.next == null) arr.add(temp.data);

            temp = head;
            System.out.println(arr);

            for (int ele : arr) {
                temp.data = ele;
                temp = temp.next;
            }
            return head;
        }

        public static Node segregateEvenOdd(Node head){
            Node odd = head;
            Node even = head.next;
            Node evenHead = head.next;

            if (head == null || head.next == null)
                return head;
            while (even != null && even.next != null){
                odd.next = odd.next.next;
                even.next = even.next.next;

                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }

    }
}
