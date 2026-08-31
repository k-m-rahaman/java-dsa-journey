public class LongestCommonSubsequence {

    static int lcs(String first, String second) {

        int n = first.length();
        int m = second.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (first.charAt(i - 1)
                        == second.charAt(j - 1)) {

                    dp[i][j] =
                            1 + dp[i - 1][j - 1];

                } else {

                    dp[i][j] =
                            Math.max(
                                    dp[i - 1][j],
                                    dp[i][j - 1]
                            );
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {

        String first = "ABCDGH";
        String second = "AEDFHR";

        System.out.println(
                "LCS Length = "
                        + lcs(first, second)
        );
    }
}