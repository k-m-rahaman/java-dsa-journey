public class SubsetSum {

    static boolean subsetSum(int[] arr, int target) {

        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Sum 0 is always possible with an empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {

            for (int sum = 1; sum <= target; sum++) {

                // Do not include current element
                dp[i][sum] = dp[i - 1][sum];

                // Include current element if possible
                if (arr[i - 1] <= sum) {

                    dp[i][sum] =
                            dp[i][sum]
                            || dp[i - 1][sum - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};

        int target = 11;

        System.out.println(
                "Subset with sum " + target + ": "
                        + subsetSum(arr, target)
        );
    }
}