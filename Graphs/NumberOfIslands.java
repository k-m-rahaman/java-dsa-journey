public class NumberOfIslands {

    static void dfs(char[][] grid, int row, int col) {

        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows
                || col < 0 || col >= cols
                || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }

    static int countIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(
                "Number of Islands = "
                        + countIslands(grid)
        );
    }
}