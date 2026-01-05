package LinkedList;

import java.util.HashMap;
import java.util.Map;

//leet-code 3063
public class LinkedListFrequency {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
//You are given the head of a singly linked list.
//Your task is to count the frequency of each value in the linked list and return the result as a map:

    public static Map<Integer, Integer> frequenciesOfElements(Node head){
        Map<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null){
            if(!map.containsKey(temp.val)){
                map.put(temp.val,1);
            }
            else{
                map.put(temp.val,map.get(temp.val)+1);
            }
            temp = temp.next;
        }
        return map;
    }
}
