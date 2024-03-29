public class ll{
    private Node head;
   private Node tail;
   private int size;

  public void LL() {
    this.size=0;
  }
  public void insertFirst(int value){
    Node node = new Node(value);
    node.next= head;
    head = node;

    if(tail== null){
      tail= head;
    }
    size+=1;

  }
  public void insertRec(int value, int index){
    head = insertRec(value, index , head);
  }
  private Node insertRec(int value, int index, Node node){
    if(index==0){
      Node temp = new Node(value, node);
      size++;
      return temp;
    }
    node.next= insertRec(value, index-1, node.next);
    return node;
  }
  public void insertLast(int value){
    if(tail==null){
      insertFirst(value);
      return;
    }
    Node node= new Node(value);
    tail.next= node;
    tail = node;
    size++;

  }
  public void insert(int value, int index){
    if(index==0){
      insertFirst(value);
      return;
    }
    if(index==size){
      insertLast(value);
      return;
    }
     Node temp = head;
     for (int i = 1; i < index; i++) {
      temp= temp.next; 
     }
     Node node= new Node(value, temp.next);
     temp.next= node;
     size++;
     
  }
  public int deletefirst(){
    if(head == null){
       tail =null;
       size--;
    }
    int value= head.value;
    head = head.next;
    return value;
  }
  public int deletelast(){
    if(size<=1){
      deletefirst();
    }
     Node secondlast = get(size-2);
     int value= tail.value;
     tail= secondlast;
     tail.next= null; 
     return value;
  }
  public int delete(int index){
    if(index==0){
      deletefirst();
    }
    if(index==size-1){
      deletelast();
    }
    Node prev= get(index-1);
    int value = prev.next.value;
    prev.next= prev.next.next;
    return value;
  }
  public Node find(int val){
    Node node = head;
    while(node!= null){
      if(node.value == val){
        return node;
      }
      node = node.next;
    }
    return null;
  }
  public Node get(int index){
   Node node= head;        
   for(int i=0; i<index;  i++){
    node = node.next;
   }
   return node;
  }
  public void display(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.value+" -> ");
      temp = temp.next;
    }
    System.out.println("End");
  }
  private class Node{
    private int value;
    private Node next;
    public Node(int value) {
      this.value = value;
    }
    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
    
  }
  public void duplicates(){
    if (head == null || head.next == null) {
      return;
  }
    Node node = head;
    while(node.next!= null&& node!= null){
      if(node.value==node.next.value){
        node.next = node.next.next;
        size--;
      }
      else{
        node = node.next;
      }
  Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    tail = temp;
    }
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
    public static boolean hasCycle(Node head){
       Node fast = head;
       Node slow = head;

       while(fast!=null && slow!=null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
            return true;
          }
       }
       return false;
    }
    public static int lengthCycle(Node head){
      Node fast = head;
      Node slow = head;

       while(fast!=null && slow!=null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
            Node temp = slow;
            int length = 0;
            do{
              temp = temp.next;
              length++;
            }while(temp!=slow);
            return length;
          }
       }
       return 0;
    }
    public void reversell(Node node){
      if(node==tail){
        head= tail;
        return;
      }

      reversell(node.next);

      tail.next= node;
      tail = node;
      tail.next = null;
    }
    public void reversellit(Node node){
      if(size<2){
        return;
      }
      Node prev = null;
      Node pres = head;
      Node next = pres.next;

      while(pres != null){
        pres.next = prev;
        prev = pres;
        pres = next;
        if(next != null)
        {
         next = next.next;

      }
      head = prev;
    }
}