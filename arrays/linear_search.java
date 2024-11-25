package arrays;
public class linear_search {
    public static void main(String args[]) {
        int arr[] = {2,4,5,6,7,8,9,0};
        int num = 10; int count = 1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == num) {
                count = 0;
                System.out.println("number found at index " + i);
            }
        }
        if(count == 1) {
            System.out.println("number not found");
        }
    }
}
