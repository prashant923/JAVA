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
  public void insertlasT(int value){
    if(tail==null){
      insertfirst(value);
      return;
    }
    Node node = new Node(value);
    tail.next = node;
    node.next = null;
    tail = node;
    

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
