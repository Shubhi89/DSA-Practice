package binarytree;

public class heightOfTree {
    static class Node {
        int data;
        Node left , right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh , rh) + 1;
    }

    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc+rc+1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls + rs + root.data;

    }

    public static int diameterOfTree(Node root) { // O(n^2)
        if(root == null) {
            return 0;
        }

        int ld = diameterOfTree(root.left);
        int rd = diameterOfTree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiameter = lh+rh+1;
        return Math.max(selfDiameter , Math.max(ld , rd));
    }
    public static void main(String[] args) {
        /*
                       1
                      /  \
                     2    3
                    / \  / \
                   4   5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(diameterOfTree(root));
    }
}
