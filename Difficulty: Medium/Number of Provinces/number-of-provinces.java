import java.util.ArrayList;

class Solution {

    static void dfs(ArrayList<ArrayList<Integer>> adjlist, int s, boolean[] visited) {
        visited[s] = true;

        for (int neighbor : adjlist.get(s)) {
            if (!visited[neighbor]) {
                dfs(adjlist, neighbor, visited);
            }
        }
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < V; i++) {
            adjlist.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(adjlist, i, visited); 
            }
        }

        return count;
    }
}
