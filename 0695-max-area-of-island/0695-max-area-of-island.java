
class Solution {

    static int dfs(int[][] grid, int i, int j, int row, int col) {

        // Out of bounds or water
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != 1) {
            return 0;
        }

        // Mark visited
        grid[i][j] = 0;

        // Count current cell
        int area = 1;

        // Explore 4 directions
        area += dfs(grid, i, j - 1, row, col);
        area += dfs(grid, i - 1, j, row, col);
        area += dfs(grid, i + 1, j, row, col);
        area += dfs(grid, i, j + 1, row, col);

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int maxArea = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {

                    int area = dfs(grid, i, j, row, col);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}