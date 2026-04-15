import java.util.*;

public class maxnumcoins {

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int n = piles.length;
        int left = 0;
        int right = n - 1;
        int coins = 0;

        while (left < right) {
            right--; // Alice
            coins += piles[right]; // You
            right--; // move ahead
            left++;  // Bob
        }

        return coins;
    }

    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
        System.out.println(maxCoins(piles)); // 9
    }
}