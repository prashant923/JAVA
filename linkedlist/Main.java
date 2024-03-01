public class Main {
    public static void main(String[] args) {
//************************************LINKED LIST SINGLY*********************************** */ 
        // ll list = new ll();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertFirst(0);
        // list.insertLast(14);
        // list.insert(499, 3);
        // list.display();
        // System.out.println(list.deletelast());
        // list.deletelast();
        // list.display();

        // ****************************DOUBLY LINKED LIST*******************************************
//         DLL list = new DLL();
//     list.insertfirst(12);
//     list.insertfirst(03);
//     list.insertfirst(05);
//     list.insertfirst(03);
//     list.insertfirst(3);
//     list.insertfirst(2);
//    list.insertlasT(45);
//    list.insertAfter(5, 344);
//    list.insert(60000,2);
//    list.insertbefore(344, 789);

//    list.deletefirst();
//    list.deletelast();

//     list.display();

// circular linked list)))))))))))))))))))))))))))))))))))))))/

    // CLL list = new CLL();
    // list.insert(2);
    // list.insert(3);
    // list.insert(4);
    // list.insert(7);
    // list.insert(789);
    // list.display();

    ll list = new ll();
    list.insertLast(1);
    list.insertLast(1);
    list.insertLast(2);
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(3);
    list.insertLast(3);
    list.insertLast(3);
    list.display();
    // list.insertRec(345, 2);
    // list.display();
    list.duplicates();
    list.display();

    ll first = new ll();
    first.insertLast(1);
    
    first.insertLast(2);
  
    first.insertLast(3);
    first.insertLast(3);
    ll second = new ll();
    second.insertFirst(0);
 
    second.insertLast(14);
    ll ans = ll.mergeSorted(first, second);
    ans.display();

    ans.lengthCycle(ans);
    

    }
}
