package greedyalgo;
import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder()); // decreasing order sort

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++) {
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins = " + countOfCoins);

        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
