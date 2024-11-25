package arrays;

public class matrix1 {
    public static int search7(int matrix[][]) {
        int row = 0; int col = matrix[0].length;
        int count = 0;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == 7) {
                count++;
            }
            else if(matrix[row][col] > 7) {
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
