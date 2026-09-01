public class LongestPalindromicSubsequence {

    static int lps(String str) {

        int n = str.length();

        int[][] dp = new int[n][n];

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Length of substring
        for (int length = 2; length <= n; length++) {

            for (int i = 0; i <= n - length; i++) {

                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j)) {

                    if (length == 2) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }

                } else {

                    dp[i][j] = Math.max(
                            dp[i + 1][j],
                            dp[i][j - 1]
                    );
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {

        String str = "BBABCBCAB";

        System.out.println(
                "Longest Palindromic Subsequence Length = "
                        + lps(str)
        );
    }
}