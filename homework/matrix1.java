package homework;


public class matrix1 {
    public static int search7(int matrix[][]) {
        int count = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println(search7(matrix));
    }
}
