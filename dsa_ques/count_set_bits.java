package dsa_ques;

public class count_set_bits {
    public static int countSetBits(int n) { // O(log n)
        int count = 0;
        while(n > 0) {
            if((n&1) != 0) { // check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
