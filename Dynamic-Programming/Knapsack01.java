public class Knapsack01 {

    static int knapsack(
            int[] weights,
            int[] values,
            int capacity) {

        int n = weights.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            for (int w = 1; w <= capacity; w++) {

                if (weights[i - 1] <= w) {

                    int include =
                            values[i - 1]
                                    + dp[i - 1][w - weights[i - 1]];

                    int exclude =
                            dp[i - 1][w];

                    dp[i][w] =
                            Math.max(include, exclude);

                } else {

                    dp[i][w] =
                            dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};

        int[] values = {1, 4, 5, 7};

        int capacity = 7;

        System.out.println(
                "Maximum Value = "
                        + knapsack(
                                weights,
                                values,
                                capacity
                        )
        );
    }
}