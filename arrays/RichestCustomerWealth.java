public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };

        int result = maximumWealth(accounts);

        System.out.println("Richest Wealth: " + result);
    }
}