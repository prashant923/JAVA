public class mergesort{

    public ListNode sortList(ListNode head){
      if(head==null || head.next==null){
        return head;
      }
      ListNode mid = getMid(head);
      ListNode left = sortList(head);
      ListNode right = sortList(mid);

      return mergeSorted(left,right);
    }

    public ListNode getMid(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
        
    }
    public  static ll mergeSorted(ll first, ll second){
        if (first == null || second == null)
        return null; 
        Node f= first.head;
        Node s= second.head;
        
         ll answer = new ll();
         while(f!=null && s!=null){
         if(f.value<s.value){
           answer.insertLast(f.value);
           f = f.next;
         }
         else {
          answer.insertLast(s.value);
          s = s.next;
         }
         while(f!=null){
          answer.insertLast(f.value);
          f = f.next;
         }
         while(s!=null){
          answer.insertLast(s.value);
          s = s.next;
         }
         }
        return answer;
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