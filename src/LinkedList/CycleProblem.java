package LinkedList;

import java.util.HashMap;

public class CycleProblem {
    public static class Node
    {
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
    }
// Detect loop in a linked list
    // Brute force with extra space....
    public static boolean detectLoop(Node head){
        Node temp = head;
        HashMap<Node , Integer> map = new HashMap<>();
        while(temp != null && temp.next != null){
            if(map.containsKey(temp))
                return true;
            map.put(temp ,1);
            temp = temp.next;
        }
        return false;
    }
    // optimal solution with tortoise and mare method;
    public static boolean detectCycle(Node head){
        if(head == null || head.next == null)
            return false;

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;

        }
        return false;
    }

    // length of the loop BruteForce solution
    public static int findLengthOfLoop(Node head){
        Node temp = head;
        int len = 1;
        HashMap<Node,Integer> map = new HashMap<>();
        while (temp != null){
            if(map.containsKey(temp)){
                int value = map.get(temp);
                return len-value;
            }
            map.put(temp,len);
            len++;
            temp = temp.next;
        }
        return 0;
    }


    // find the length of the loop

    public static int findLength(Node slow , Node fast){
        int cnt = 1;
        fast = fast.next;
        while (slow != fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }

    public  static int lengthOfLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return findLength(slow,fast);
            }
        }
        return 0;
    }
    //  find starting of the loop in linked list
    // Brute = time/Space : O(n)
    public static Node findStart(Node head){
        Node temp = head;
        HashMap<Node , Integer> map = new HashMap<>();
        while(temp != null){
            if (map.containsKey(temp))
                return temp;

            map.put(temp,1);
            temp = temp.next;
        }
        return null;
    }

    // Optimized
    public static Node findStaringPoint(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
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
        e.next = b;
        System.out.println(detectCycle(a));
        System.out.println(lengthOfLoop(a));
        System.out.println(findStart(a));
        System.out.println(findStaringPoint(a));
        System.out.println(detectLoop(a));
        System.out.println(findLengthOfLoop(a));

    }
}
