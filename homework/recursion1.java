package homework;

public class recursion1 {
    public static void printIdx(int arr[] , int key , int si, int ei) {
        if(si > ei) {
            return;
        }
        if(arr[si] == key) {
            System.out.print(si + " ");
        }
        printIdx(arr, key, si+1, ei);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        printIdx(arr, 2, 0, arr.length-1);
    }
}
