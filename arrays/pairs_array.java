package arrays;

public class pairs_array {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10}; int total =0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                System.out.println("pairs = " + arr[i] +" " + arr[j]);
                total++;
            }
        }
        System.out.println(total);
    }
}
