import java.util.*;

public class game {

    public static int findTheWinner(int n, int k) {
        int winner = 0; // 0-based index

        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1; // convert to 1-based index
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findTheWinner(5, 2)); // Expected: 3
        System.out.println(findTheWinner(6, 5)); // Expected: 1
    }
}