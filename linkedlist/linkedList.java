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
    public static int size;

    // methods

    public void addFirst(int data) { // O(1)
        // step1 
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // O(n)
        if(head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx , int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i< idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key) { // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head , int key) { // both time & space = O(n)
        if(head == null) {
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1) {
            return idx;
        }

        return idx+1;
    }

    public int recursiveSearch(int key) {
        return helper(head,key);
    }

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;

        while(temp != null) {
            temp = temp.next;
            sz++;
        } 
        
        if(n==sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) { // slow - fast approach
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // mid node 
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // step 1 = find mid
        Node midNode = findMid(head);
        // step 2 = reverse 2nd half 
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; 
        // step 3 = check left half and right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.add(3, 9);
        ll.print();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.search(9));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
        ll.addLast(9);
        System.out.println(ll.checkPalindrome());
    }
}    
