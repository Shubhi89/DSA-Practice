package arrays;
public class binary_search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 2;
        int start = 0; int end = (arr.length) -1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == key) {
                System.out.println("key found at index = " + mid);
            }
            if(arr[mid] > key) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
    }
}
