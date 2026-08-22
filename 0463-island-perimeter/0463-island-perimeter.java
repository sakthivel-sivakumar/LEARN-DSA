class Solution {

    public int islandPerimeter(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};

        int perimeter = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {

                    for (int k = 0; k < 4; k++) {

                        int newRow = i + delRow[k];
                        int newCol = j + delCol[k];

                        // Outside grid
                        if (newRow < 0 || newCol < 0 ||
                            newRow >= row || newCol >= col) {

                            perimeter++;
                        }

                        // Water
                        else if (grid[newRow][newCol] == 0) {

                            perimeter++;
                        }
                    }
                }
            }
        }

        return perimeter;
    }
}