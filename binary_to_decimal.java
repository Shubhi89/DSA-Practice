public class binary_to_decimal {
    public static int binToDec(int n) {
        int pow = 0; int dec = 0;
        while(n>0) {
            int last = n%10;
            dec = dec + (last * (int)Math.pow(2,pow));
            pow++;
            n /= 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        int decimal = binToDec(101);
        System.out.println("decimal value is " + decimal);
    }
}
