package arrays;
public class largest_number {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 67, 8, 977, 54, 332, 34, 78 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest element is " + largest);
    }
}
