package linkedlist;

public class linkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // methods
    public void addFirst(int data) { // O(1)
        // step1 
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step 2
        newNode.next = head;
        // step 3
        head = newNode;
    }
    public void addLast(int data) { // O(1)
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(5);
    }
    
}
