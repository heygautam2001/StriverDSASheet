package LinkedList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//leet-code 82
public class RemoveDuplicatesFromSortedListII {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
       if(head == null)
           return null;
       ListNode temp = head;
       Map<Integer,Integer> map = new LinkedHashMap<>();
       while (temp != null){
           map.put(temp.val, map.getOrDefault(temp.val,0)+1);
           temp = temp.next;
       }
       ListNode dummy = new ListNode(-1);
       temp = dummy;

       for(int key : map.keySet()){
           if(map.get(key) == 1){
               ListNode node = new ListNode(key);
               temp.next = node;
               temp = temp.next;
           }
       }
       return dummy.next;
    }
}
