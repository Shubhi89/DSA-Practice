package queue;
import java.util.*;
public class from2Stacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add method
        public static void add(int data) { // O(n)
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove method
        public static int remove() { // O(1)
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }

        // peek method
        public static int peek() { // O(1)
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
    //    Queue q = new Queue();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);

    //     while(!q.isEmpty()) {
    //         System.out.println(q.peek());
    //         q.remove();
    //     }
    }
}