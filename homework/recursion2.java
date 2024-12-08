package homework;

public class recursion2 {
        static String digits[] = {"zero" , "one" , "two" , "three" , "four" ,"five" , "six" ,"seven","eight" ,"nine"};
    public static void printNum(int num) {
        if(num == 0) {
            return;
        }
        int lastdigit = num%10;
        printNum(num/10);
        System.out.print(digits[lastdigit] + " ");
    }
    public static void main(String[] args) {
        int num = 2719;
        printNum(num);
    }
}
