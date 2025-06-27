import java.util.*;

class Solution {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int V = adj.size();
        int[] dist = new int[V];
        Arrays.fill(dist, -1); // -1 means unvisited

        Queue<Integer> q = new LinkedList<>();
        dist[src] = 0;
        q.add(src);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neigh : adj.get(node)) {
                if (dist[neigh] == -1) { // not visited
                    dist[neigh] = dist[node] + 1;
                    q.add(neigh);
                }
            }
        }

        return dist;
    }
}
