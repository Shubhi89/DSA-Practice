package recursion;

public class first_occurence {
    public static int firstOccurence(int arr[] , int i, int key) {// time = O(n) , space = O(n)
        if(i == arr.length-1) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,89};
        System.out.println(firstOccurence(arr, 0, 2));
    }
}
