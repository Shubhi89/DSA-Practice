public class prime_range {
    public static boolean checkPrime(int n) {
        for(int i = 2; i<= Math.sqrt(n);i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int range = 50;
        for(int i =2;i<=range;i++) {
            if(checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
