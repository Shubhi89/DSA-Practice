package homework;

public class count_lowerCase {
    public static int countLowerCase(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            char s = str.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "shubhidwivedi";
        System.out.println(countLowerCase(str));
    }
}
