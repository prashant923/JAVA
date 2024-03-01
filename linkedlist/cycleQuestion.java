public class InterviewQuestions {

    // https://leetcode.com/problems/linked-list-cycle
    // Asked in Amazon and Microsoft interviews
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // Empty or single node list cannot have a cycle
        }
        
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Find the length of the cycle
    https://leetcode.com/problems/find-the-duplicate-number/description/
    public int lengthCycle(ListNode head) {
        if (head == null || head.next == null) {
            return 0; // Empty or single node list cannot have a cycle
        }
        
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // Calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0; // No cycle found
    }
  
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            if(fast== slow){
                length = lengthCycle(slow);
            }
        }
        //if length is 0 means no  cycle is present
        if(length==0){
            return -1;
        }
        // find start of the node
        ListNode f = head;
        ListNode s = head;

        while(length>0){
            s=s.next;
            length--;
        }
        //we will keep moving both forward until they meet at the same point
        //that point will be considered asstart of the node;
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        
    }
    static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
