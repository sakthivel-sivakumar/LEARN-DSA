class Solution {
    public int[][] updateMatrix(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] res= new int[m][n];
        boolean[][] vis = new boolean[m][n];
        
        Queue<int[]> q = new LinkedList<>();
        // find the initial sources (1)
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                    res[i][j] = 0;
                    vis[i][j] = true;
                }
            }
        }
        int dr[] = {0,0,-1,1};
        int dc[] = {-1,1,0,0};
        int dis = 1; 
        while(!q.isEmpty()){
            int len = q.size();
            for(int k=0;k<len;k++){
                int[] p = q.poll();
                int cr = p[0];
                int cc = p[1];
                
                // find neighbours
                for(int i=0;i<4;i++){
                    int nr = cr + dr[i];
                    int nc = cc + dc[i];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && (!vis[nr][nc])){
                        res[nr][nc] = dis;
                        q.add(new int[]{nr,nc});
                        vis[nr][nc] = true;
                    }
                }
            }
            dis+=1;
        }
        return res;
        
    }
}