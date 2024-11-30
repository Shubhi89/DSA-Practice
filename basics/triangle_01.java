package basics;
public class triangle_01 {
    public static void main(String args[]) {
        int line = 5;
        for(int i =1;i<=line;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1"+" ");
                } else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}
