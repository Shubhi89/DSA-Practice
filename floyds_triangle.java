public class floyds_triangle {
    public static void main(String args[]) {
        int line = 5;
        int num = 1;

        for(int i=1;i<=line;i++) {
            for(int j =1;j<=i;j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
