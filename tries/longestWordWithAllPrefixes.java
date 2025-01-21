package tries;

public class longestWordWithAllPrefixes {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
        int freq;

        public Node() {
            for(int i=0;i<children.length;i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static void findPrefix(Node root , String ans) { // O(L)
        if(root == null) {
            return;
        }
        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26;i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static String ans = "";
    public static void longestWord(Node root , StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0;i<26;i++) {
            if(root.children[i] != null && root.children[i].endOfWord == true) {
                char ch = (char) (i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                // backtrack step
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a" ,"banana" , "app" , "appl" , "ap" , "apply" , "apple"};

        for(int i=0;i<words.length;i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
