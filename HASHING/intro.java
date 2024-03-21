import java.util.HashSet;

import java.util.Iterator;

public class intro{
     public static void main(String[]args){

        HashSet<Integer> set = new HashSet<>();

        //adding
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        
        System.out.println(set);

        //removing
        set.remove(1);

        System.out.println(set);

        System.out.println("size = "+set.size());

        //iterator

        Iterator it = set.iterator();

        System.out.println(it.next());
    
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}