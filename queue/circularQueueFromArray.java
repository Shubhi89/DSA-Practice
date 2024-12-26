package queue;

public class circularQueueFromArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // checks empty queue
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // checks full queue
        public static boolean isFull() {
            return (rear+1)% size == front;
        }

        // add method
        public static void add(int data) { // O(1)
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }
            if(front == -1) { // adding first element
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // remove method
        public static int remove() { // O(1)
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];

            if(rear == front) { // deleting last element
                rear = front = -1;
            } else {
                front = (front+1)%size;
            }
            return result;
        }

        // peek method
        public static int peek() { // O(1)
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }
    }
}
