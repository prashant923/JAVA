package stackandqueues;
import java.util.*;

public  class intro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack);
        // stack.clear();
        System.out.println(stack);
        // stack.remove(2);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.add(11);
        queue.add(22);
        queue.add(32);
        queue.add(43);
        queue.add(55);
        while(!queue.isEmpty()){
        System.out.println(queue.remove());
        }
    }
     
}