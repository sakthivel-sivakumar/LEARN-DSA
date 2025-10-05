class Solution 
{
    static int dr[] = {0,0,-1,1};
    static int dc[] = {-1,1,0,0};
    static void dfs(char mat[][],int i,int j,boolean vis[][],int m,int n){
        for(int k=0;k<4;k++)
        {
            int nr = i+dr[k];
            int nc = j+dc[k];
            
            // validate
            if(nr>=0 && nr<m && nc>=0 && nc<n && mat[nr][nc] == 'O' && (!vis[nr][nc])){
                vis[nr][nc] = true;
                dfs(mat,nr,nc,vis,m,n);
            }
        }
    }
    public void solve(char mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        
        boolean vis[][] = new boolean[m][n];
        
        // find the 'O' at boundary
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && mat[i][j]=='O' && (i==0 || i==m-1 || j==0 || j== n-1)){
                    vis[i][j] = true;
                    dfs(mat,i,j,vis,m,n);
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && mat[i][j]=='O')
                    mat[i][j]='X';
            }
    }
}
}