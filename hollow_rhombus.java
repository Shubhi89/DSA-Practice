public class hollow_rhombus {
    public static void main(String args[]) {
        int line = 5;
        for(int i =1;i<=line;i++) {
            for(int j=1;j<=(line-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=line;j++) {
                if(i==1 || j==1 || i==line || j==line) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
