package LinkedListDoubly;

import extras.multiThreading.A;

import javax.imageio.metadata.IIOMetadataNode;
import java.util.ArrayList;
import java.util.List;

public class FindPairsWithGivenSum {
    // The Linked List Must be Sorted.....
    public List<List<Integer>> pairSum(ListNode head , int sum){
        List<List<Integer>> ans = new ArrayList<>();
        ListNode temp1 = head;
        while (temp1 != null){
            ListNode temp2 = temp1.next;
            while (temp2 != null && temp1.val + temp2.val <= sum){
                if(temp1.val + temp2.val == sum){
                    List<Integer> list = new ArrayList<>();
                    list.add(temp1.val);
                    list.add(temp2.val);
                    ans.add(list);
                    list.clear();
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return ans;
    }

    public static ListNode findTail(ListNode head){
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public List<List<Integer>> findPair(ListNode head , int sum){
        List<List<Integer>> ans = new ArrayList<>();
        if (head == null)
            return ans;

        ListNode left = head;
        ListNode right = findTail(head);
        while (left.val < right.val){
            if(left.val + right.val == sum){
                List<Integer> pair = new ArrayList<>();
                pair.add(left.val);
                pair.add(right.val);
                ans.add(pair);
                left = left.next;
                right = right.back;
            } else if (left.val + right.val > sum) {
                right = right.back;
            }else{
                left = left.next;
            }
        }
        return ans;
    }

}
