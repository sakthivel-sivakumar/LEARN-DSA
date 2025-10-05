class Solution 
{

    static int dr[] = {0,0,-1,1};
    static int dc[] = {-1,1,0,0};
    void dfs(int grid[][],int i,int j,boolean vis[][],int m,int n)
    {
        for(int k=0;k<4;k++){
            int nr = i+dr[k];
            int nc = j+dc[k];
            
            // validate
            if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc] == 1 && (!vis[nr][nc])){
                vis[nr][nc] = true;
                dfs(grid,nr,nc,vis,m,n);
            }
        }
    }
     public int numEnclaves(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        
        // find the initial sources (1)
        // Traverse first and last row
        for(int j=0;j<n;j++){
            if(grid[0][j]== 1 && !vis[0][j]){
                vis[0][j] = true;
                dfs(grid,0,j,vis,m,n);
            }
            if(grid[m-1][j]==1 && !vis[m-1][j]){
                vis[m-1][j] = true;
                dfs(grid,m-1,j,vis,m,n);
            }
        }
        
        // Traverse first and last column
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && !vis[i][0]){
                vis[i][0] = true;
                dfs(grid,i,0,vis,m,n);
            }
            if(grid[i][n-1]==1 && !vis[i][n-1]){
                vis[i][n-1] = true;
                dfs(grid,i,n-1,vis,m,n);
            }
        }
        
        int cnt = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]== 1)
                    cnt++;
        }
       
    
    }
    return cnt;   
}
}