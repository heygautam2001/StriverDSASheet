package LinkedList;

import java.util.HashMap;

public class IntersectionPointInYLL {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode temp1 = headA;
//        ListNode temp2 = headB;
        while(temp1 != null){
            map.put(temp1,1);
            temp1 = temp1.next;
        }
        temp1 = headB;
        while(temp1 != null){
            if(map.containsKey(temp1)){
                return temp1;
            }
            temp1 = temp1.next;
        }
        return null;
    }

    public static ListNode getIntersectionNodeLL(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == temp2)return temp1;

            if(temp1 == null) temp1 = headB;
            if(temp2 == null) temp2 = headA;
        }
        return temp1;
    }
    public static void main(String[] args) {
//        ListNode

    }
}
