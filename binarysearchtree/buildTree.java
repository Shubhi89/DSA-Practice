package binarysearchtree;
import java.util.*;
public class buildTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        } 
    }

    public static Node insert(Node root , int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            // left subtree
            root.left = insert(root.left , val);
        } else {
            // right subtree
            root.right = insert(root.right , val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root , int key) { // O(H)
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
           return search(root.left, key);
        } else {
           return search(root.right, key);
        }
    }

    public static Node delete(Node root , int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        } else if(root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 = leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 = single child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 = both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root , int k1 , int k2) {
        if(root == null) {
            return;
        }
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> paths) {
        for(int i=0;i<paths.size();i++) {
            System.out.print(paths.get(i)+" ");
        }
        System.out.println("null");
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> paths) {
        if(root == null) {
            return;
        }
        paths.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(paths);
        }
        rootToLeafPath(root.left, paths);
        rootToLeafPath(root.right, paths);
        paths.remove(paths.size() -1);
    }

    public static boolean isValidBST(Node root , Node min , Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right,root, max);
    }

    public static Node mirror(Node root) {
        if(root == null) {
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        if(search(root, 9)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        root = delete(root, 5);
        inorder(root);
        System.out.println();
        printInRange(root, 1, 10);

        rootToLeafPath(root, new ArrayList<>());

        if(isValidBST(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        root = mirror(root);
        preOrder(root);
    }
}
