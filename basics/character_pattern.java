package basics;
public class character_pattern {
    public static void main(String args[]) {
        int line = 5;
        char ch = 'A';
        for(int i =0;i<line;i++) {
            for(int j =0;j<=i;j++) {
                System.out.print(" " + ch);
                ch++;
            }
            System.out.println();
        }
    }
}

