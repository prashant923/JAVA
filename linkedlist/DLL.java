public class DLL {
    private Node head;
    private Node tail;
    public void insertfirst(int value){
      Node node = new Node(value);
      node.next =head;
      node.prev =null;
      if(head!= null){
      head.prev= node;
      }
      head=node;
      
    }
    public void display(){
      Node node = head;
      Node last = null;
      while (node!=null) {
        System.out.print(node.value+" -> ");
        last = node;
        node= node.next;
      }
      System.out.println("END");
      System.out.println();
      System.out.println("printing in reverse");

      while ( last != null){
        System.out.print(last.value+" -> ");
        last= last.prev;
      }
       System.out.println("Start");
      
  
    }
    public void insert(int value, int index){
      if(index==0){
        insertfirst(value);
        return;
      }
      
      Node temp = head;
      for(int i=0; i<index; i++){
        if(temp == null) {
          // Handle the case where the index is out of bounds
          System.out.println("Index out of bounds");
          return;
      }
        temp = temp.next;
      }
      if(temp==null){
        insertlasT(value);
      }
      Node node = new Node(value);
      node.next = temp.next;
      node.prev= temp;
      if(temp.next != null) {
        temp.next.prev = node; // Update the previous reference of the next node
    }
      temp.next= node;
     
    }
  public void insertbefore(int before, int value){
    Node p= find(before);
    if(p==null){
      System.out.println("does not exist");
      return;
    }
    Node node= new Node(value);
    node.prev= p.prev;
    node.next = p;
    
    p.prev= node;
  }
    public void insertAfter(int after, int value){
      Node p = find(after);
      if(p==null){
        System.out.println("does not exist");
        return;
      }
      Node node = new Node(value);
      node.next = p.next;
      p.next = node;
      node.prev = p;
      if(node.next!=null){
        node.next.prev=node;
      }
      
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
  public void insertlasT(int value){
    if (head == null) {
      head = new Node(value);
      return;
  }
    Node last = head;
     while (last.next!= null) {
      last = last.next;
     }
     Node newnode = new Node(value);
     last.next = newnode;
     newnode.prev = last;
    

  }
    private class Node{
      int value;
      Node next;
      Node prev;
      public Node(int value) {
        this.value = value;
      }
      public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
      }
      
      
    }
}
