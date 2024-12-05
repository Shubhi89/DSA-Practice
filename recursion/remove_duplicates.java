package recursion;

public class remove_duplicates {
    public static void removeDuplicates(String s , int i , StringBuilder newStr , boolean map[]) {
        if(i == s.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = s.charAt(i);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(s, i+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(s, i+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
