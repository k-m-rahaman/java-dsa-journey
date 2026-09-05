public class UniquePaths {

    static int uniquePaths(int rows, int columns) {

        int[][] dp = new int[rows][columns];

        // First row
        for (int j = 0; j < columns; j++) {
            dp[0][j] = 1;
        }

        // First column
        for (int i = 0; i < rows; i++) {
            dp[i][0] = 1;
        }

        // Remaining cells
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < columns; j++) {

                dp[i][j] =
                        dp[i - 1][j]
                        + dp[i][j - 1];
            }
        }

        return dp[rows - 1][columns - 1];
    }

    public static void main(String[] args) {

        int rows = 3;
        int columns = 7;

        System.out.println(
                "Number of Unique Paths = "
                        + uniquePaths(rows, columns)
        );
    }
}