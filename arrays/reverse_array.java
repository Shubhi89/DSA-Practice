package arrays;

public class reverse_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int j = (arr.length) - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;j--;
        }
        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
