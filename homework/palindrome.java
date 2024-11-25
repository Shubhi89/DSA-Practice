package homework;
public class palindrome {
    public static boolean isPalindrome(int n) {
        int num1 = n; int num2 = 0;
        while(n>0) {
            int rem = n%10;
            num2 = (num2*10) + rem;
            n /= 10;
        }
        if(num1 == num2) {
            return true;
        } 
        return false;
    }
    public static void main(String args[]) {
        System.out.println(isPalindrome(727));
    }
}
