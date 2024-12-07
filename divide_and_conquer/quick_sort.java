package divide_and_conquer;

public class quick_sort { // not takes extra space , average=O(nlogn) , worst=O(n^2)
    public static void quickSort(int arr[] , int si , int ei) {
        if(si >= ei) {
            return;
        }
        // pivot -> last element
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1); // left part
        quickSort(arr, pivotIdx+1, ei); // right part
    }

    public static int partition(int arr[] , int si , int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot
        for(int j=si;j<ei;j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    int arr[] = {6,3,9,6,3,4,0,2,1};
    quickSort(arr, 0, arr.length-1);
    printArray(arr);
  }  
}
