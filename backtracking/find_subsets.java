package backtracking;
// find and print all subsets of a given string
public class find_subsets {
    public static void findSubsets(String str , String ans , int i) { // time = O(n*2^n) , space = O(n)
        // base case 
        if(i == str.length()) {
            if(ans.length()== 0) {
                System.out.print("null  ");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // recursion
        // yes - choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // no choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new String(""), 0);
    }
}
