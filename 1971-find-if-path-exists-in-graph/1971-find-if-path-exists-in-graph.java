class Solution {

    public boolean validPath(int n, int[][] edges,
                             int source, int destination) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int node, int destination,
                         ArrayList<Integer>[] graph,
                         boolean[] visited) {

        if (node == destination) {
            return true;
        }

        visited[node] = true;

        for (int next : graph[node]) {

            if (!visited[next]) {

                if (dfs(next, destination, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}