public class RodCutting {

    static int rodCutting(int[] prices, int length) {

        int[] dp = new int[length + 1];

        for (int i = 1; i <= length; i++) {

            int maxProfit = 0;

            for (int cut = 1; cut <= i; cut++) {

                maxProfit = Math.max(
                        maxProfit,
                        prices[cut - 1] + dp[i - cut]
                );
            }

            dp[i] = maxProfit;
        }

        return dp[length];
    }

    public static void main(String[] args) {

        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};

        int length = 8;

        System.out.println(
                "Maximum Profit = "
                        + rodCutting(prices, length)
        );
    }
}