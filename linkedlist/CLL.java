public class CLL {
    private Node head;
    private Node tail;

    
    public void insertfirst(int value){
        if(head== null){
            head= new Node(value);
            return;
        }
        Node node = new Node(value); 
        head.prev = node;
        node.next = head;
        head= node;

        
    }
    public void insertLast(int value) {
        Node newNode = new Node(value);
    
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
            newNode.next = head; // Make it circular
        } else {
            // If the list is not empty, update the next reference of the current tail
            tail.next = newNode;
            // Update the next reference of the new node to point to the head (making it circular)
            newNode.next = head;
            // Update the tail to be the new node
            tail = newNode;
        }
    }
    
    public void display(){ 
        Node node = head;
        while(node!= null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.println("end");
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

