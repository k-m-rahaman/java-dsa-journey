public class MinimumPathSum {

    static int minimumPathSum(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;

        int[][] dp = new int[rows][columns];

        dp[0][0] = grid[0][0];

        // First row
        for (int j = 1; j < columns; j++) {

            dp[0][j] =
                    dp[0][j - 1] + grid[0][j];
        }

        // First column
        for (int i = 1; i < rows; i++) {

            dp[i][0] =
                    dp[i - 1][0] + grid[i][0];
        }

        // Remaining cells
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < columns; j++) {

                dp[i][j] =
                        grid[i][j]
                        + Math.min(
                                dp[i - 1][j],
                                dp[i][j - 1]
                        );
            }
        }

        return dp[rows - 1][columns - 1];
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println(
                "Minimum Path Sum = "
                        + minimumPathSum(grid)
        );
    }
}