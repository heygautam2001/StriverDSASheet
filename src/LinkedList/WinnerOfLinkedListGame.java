package LinkedList;

public class WinnerOfLinkedListGame {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

//    Problem Statement (3062)
//    You are given the head of a singly linked list with even length.
//    Nodes at even indices (0-based) belong to Player A
//    Nodes at odd indices belong to Player B
//    Each player’s score is the sum of values at their positions
//Task
//Return:
//"Even" if Player A wins
//"Odd" if Player B wins
//"Tie" if both scores are equal

    public static String gameResult(ListNode head){
        ListNode A = head;
        ListNode B = head != null ? head.next : null ;
        int scoreA = 0;
        int scoreB = 0;
        while(A != null && B.next != null){
            scoreA = scoreA + A.val;
            scoreB = scoreB + B.val;
            A = A.next.next;
            B = B.next.next;
        }
        if(scoreA > scoreB){
            return "Even";
        } else if (scoreA < scoreB) {
            return "Odd";
        }
        return "Tie";

//        int evenSum = 0, oddSum = 0;
//        int idx = 0;
//
//        while (head != null) {
//            if (idx % 2 == 0) evenSum += head.val;
//            else oddSum += head.val;
//            idx++;
//            head = head.next;
//        }
//
//        if (evenSum > oddSum) return "Even";
//        if (oddSum > evenSum) return "Odd";
//        return "Tie";
    }



    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);

        // Run the game
        String result = gameResult(head);

        // Print result
        System.out.println("Result: " + result);
    }
}
