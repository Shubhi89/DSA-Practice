package basics;
public class reverse_num {
    public static void main(String args[]) {
        int num = 123456789;
        int rev = 0;
        while(num>0) {
            int rem = num%10;
            rev = (rev*10) + rem;
            num /= 10;
        }
        System.out.print(rev);
    }
}
