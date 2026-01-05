package LinkedList;

import java.util.HashMap;
import java.util.Map;

// leet-code 138
public class CopyListWithRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        // Step 0: Handle empty list
        if (head == null) return null;

        // Step 1: Create a HashMap to store mapping
        // original node -> cloned node
        Map<Node, Node> map = new HashMap<>();

        // Step 2: First pass
        // Create a clone node for each original node
        // and store it in the map without setting pointers
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 3: Second pass
        // Assign next and random pointers for each cloned node
        curr = head;
        while (curr != null) {
            Node clone = map.get(curr);

            // Set next pointer
            clone.next = map.get(curr.next);

            // Set random pointer
            clone.random = map.get(curr.random);

            curr = curr.next;
        }

        // Step 4: Return head of the cloned list
        return map.get(head);
    }
}
