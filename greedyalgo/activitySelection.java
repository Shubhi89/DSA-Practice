package greedyalgo;
import java.util.*;
public class activitySelection {
    public static void main(String[] args) { // O(n logn)
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // if not sorted end time array then sorting
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lambda function -> shortform (O(log n))
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2])); // to sort a 2D array (2 is col no.)

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1;i<end.length;i++) {
            if(activities[i][1] >= lastEnd) {
                // activity select 
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = " + maxAct);
        
        for(int i=0; i<ans.size();i++) {
            System.out.print("A"+ ans.get(i) + " ");
        }
        System.out.println();
    }
}
