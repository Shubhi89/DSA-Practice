public class practice_questions {
    public static int[] reverse(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        return arr;
    }
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max ;
    }
    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
}
