class Solution 
{
    public void dfs(boolean visited[],ArrayList<ArrayList<Integer>> adj,int node)
    {
        visited[node]=true;
        for(int x:adj.get(node))
        {
            if(!visited[x])
            {
                dfs(visited,adj,x);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) 
    {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            for(int j=0;j<n;j++)
            {
                if(i!=j && isConnected[i][j] == 1)
                    adj.get(i).add(j);
            }
        }
        boolean visited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(visited,adj,i);
            }
        }
        return count;
    }
}