package basics;
public class solid_rhombus {
    public static void main(String args[]) {
        int line = 5;

        for(int i=1;i<=line;i++) {
            for(int j=1;j<=(line-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=line;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
