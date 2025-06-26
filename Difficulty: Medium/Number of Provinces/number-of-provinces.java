class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int V) {
        visited[s] = true;

        for (int j = 0; j < V; j++) {
            if (adj.get(s).get(j) == 1 && !visited[j]) {
                dfs(adj, j, visited, V);
            }
        }
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(adj, i, visited, V);
            }
        }

        return count;
    }
}
