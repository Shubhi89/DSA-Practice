package homework;
import java.util.Arrays;
public class twice_element {
    public static boolean twice(int nums[]) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(twice(nums));
    }
}
