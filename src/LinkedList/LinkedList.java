package LinkedList;
 class Node{
     int data;
     Node next;
     public Node(int data){
        this.data = data;
     }
 }
public class LinkedList {
    Node head = null;

    public void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }
    public void insertAtLast(int val){
        Node newNode = new Node(val);
        Node temp = head;
        if(temp == null){
            insertAtHead(val);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void insertAtNthIdx(int val , int idx){
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < idx-1; i++) {
            temp = temp.next;
        }
        Node nextData = temp.next;
        temp.next = null;
        temp.next = newNode;
        newNode.next = nextData;
    }
    public void update(int val , int idx){
        Node temp = head;
        if(head == null) {
            throw new NullPointerException ("cannot update a empty linked list");
        }
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.data = val;
    }

    public void deleteAtHead(){
        if (head == null)
            throw new NullPointerException("Cannot delete from empty linked list!");
        else
            head = head.next;
    }

    public void deleteFromLast(){
        Node temp = head;
        if (head == null)
            throw new NullPointerException("Cannot delete from empty Linked List");
        while(temp.next != null && temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void deleteFromAnyIdx(int idx){
        Node temp = head;
        if (head == null)
            throw new NullPointerException("cannot delete from empty linked list");
        if (head.next == null) {
            return;
        }
        for (int i = 1; i < idx-1; i++) {
            temp = temp.next;
        }
        if (temp.next.next == null){
            deleteFromLast();
            return;
        }
        Node x = temp.next.next;
        temp.next.next = null;
        temp.next = x;
    }

    public int size()
    {
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
       return size;
    }

    public int peek(){
        if (head == null)
            return Integer.MIN_VALUE;
        return head.data;
    }

    public boolean isEmpty(){
        if(size() == 0)
            return true;
        return false;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtHead(15);
        l1.insertAtHead(14);
        l1.insertAtHead(13);
        l1.insertAtHead(12);
        l1.insertAtHead(11);
        l1.insertAtLast(16);
        l1.insertAtLast(17);
        l1.display();
        l1.insertAtNthIdx(25 , 3);
        l1.display();
        l1.update(50,3);
        l1.display();
        l1.deleteAtHead();
        l1.display();
        l1.deleteFromLast();
        l1.display();
        l1.deleteFromAnyIdx(3);
        l1.display();
        l1.deleteFromAnyIdx(5);
        l1.display();
        l1.deleteFromAnyIdx(1);
        l1.display();
        l1.deleteAtHead();
        l1.deleteFromAnyIdx(1);
        l1.deleteFromLast();
        l1.deleteAtHead();
        System.out.println(l1.size());
        System.out.println(l1.peek());
        System.out.println(l1.isEmpty());;
    }
}
