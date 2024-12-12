package backtracking;
// find and print all permutations of a string 
public class find_permutations {
    public static void findPermutation(String str, String ans) { // time = O(n*n!)
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
        }
        // recursion
        for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        findPermutation(str,"");
    }
}
