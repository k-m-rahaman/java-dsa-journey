public class EditDistance {

    static int editDistance(String first, String second) {

        int n = first.length();
        int m = second.length();

        int[][] dp = new int[n + 1][m + 1];

        // Convert first string to empty string
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        // Convert empty string to second string
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (first.charAt(i - 1)
                        == second.charAt(j - 1)) {

                    dp[i][j] =
                            dp[i - 1][j - 1];

                } else {

                    int insert =
                            dp[i][j - 1];

                    int delete =
                            dp[i - 1][j];

                    int replace =
                            dp[i - 1][j - 1];

                    dp[i][j] =
                            1 + Math.min(
                                    insert,
                                    Math.min(delete, replace)
                            );
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {

        String first = "horse";
        String second = "ros";

        System.out.println(
                "Edit Distance = "
                        + editDistance(first, second)
        );
    }
}