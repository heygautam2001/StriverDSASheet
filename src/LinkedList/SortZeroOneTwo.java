package LinkedList;

public class SortZeroOneTwo {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
       // Brute force approach O(2n);
        public static Node sortZeroOneTwo(Node head){
            if (head == null || head.next == null)
                return head;
            Node temp = head;
            int cnt0 = 0;
            int cnt1 = 0;
            int cnt2 = 0;
            while(temp != null){
                if (temp.data == 0) cnt0++;
                else if (temp.data == 1) cnt1++;
                else cnt2++;
                temp = temp.next;
            }

            temp = head;
            while(temp != null){
                if(cnt0 > 0){
                    temp.data = 0;
                    cnt0--;
                } else if (cnt1 > 0) {
                    temp.data = 1;
                    cnt1--;
                }else{
                    temp.data = 2;
                    cnt2--;
                }
                temp = temp.next;
            }
            return head;
        }

        static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ->");
                temp = temp.next;
            }
        }
    }

    // Optimal Approach O(n)
    public static Node sortZeroOneTwo(Node head){
        if (head == null || head.next == null)
            return null;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while(temp != null){
            if (temp.data == 0){
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newHead = zeroHead.next;
       return newHead;

    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node.display(a);
        System.out.println();
        Node x = sortZeroOneTwo(a);
        Node.display(x);


    }
}
