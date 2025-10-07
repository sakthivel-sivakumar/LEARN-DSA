class Solution {
    boolean dfs(List<List<Integer>> adj,boolean vis[] ,boolean pathVis[],int node,boolean marker[])
    {
        vis[node] = true;
        pathVis[node] = true;
        
        for(int x:adj.get(node)){
            if(!vis[x]){
                if(dfs(adj,vis,pathVis,x,marker)==true)
                {
                    // marker[node] = false;
                    return true;
                }
            }
            else if(pathVis[x]){
                // marker[node] = false;
                return true;
            }
        }
        pathVis[node] = false;
        marker[node] = true;
        return false;
        
    }
    public List<Integer> eventualSafeNodes(int[][] edges) {
        
        int V = edges.length;
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        
        
        for(int i=0;i<V;i++){
            for(int j=0;j<edges[i].length;j++)
                adj.get(i).add(edges[i][j]);
        }

        // System.out.println(adj);
           

        boolean vis[] = new boolean[V];
        boolean pathVis[] = new boolean[V];
        boolean marker[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj,vis,pathVis,i,marker);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(marker[i]) result.add(i);
        }
        
        return result;

    }
}