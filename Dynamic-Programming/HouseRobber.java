public class HouseRobber {

    static int rob(int[] money) {

        int n = money.length;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return money[0];
        }

        int[] dp = new int[n];

        dp[0] = money[0];

        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < n; i++) {

            int robCurrent = money[i] + dp[i - 2];

            int skipCurrent = dp[i - 1];

            dp[i] = Math.max(robCurrent, skipCurrent);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        int[] money = {2, 7, 9, 3, 1};

        System.out.println(
                "Maximum Money = " + rob(money)
        );
    }
}