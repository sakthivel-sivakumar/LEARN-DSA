class Solution {

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        boolean[][] visited = new boolean[rows][cols];

        int fresh = 0;

        // Step 1: Add all rotten oranges
        // and count fresh oranges
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {

                    queue.offer(new int[]{i, j, 0});
                    visited[i][j] = true;

                } else if (grid[i][j] == 1) {

                    fresh++;
                }
            }
        }

        int minutes = 0;

        // Step 2: Multi-source BFS
        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];
            int time = curr[2];

            minutes = time;

            for (int k = 0; k < 4; k++) {

                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    grid[nr][nc] == 1 &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;

                    fresh--;

                    queue.offer(new int[]{nr, nc, time + 1});
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}