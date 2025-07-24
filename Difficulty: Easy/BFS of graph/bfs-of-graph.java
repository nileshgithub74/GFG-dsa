class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size() ;
        boolean visited[] = new boolean[V ];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        ArrayList<Integer> ans = new  ArrayList<>();
        
        
        while(!q.isEmpty()){
            int removed = q.poll();
            ans.add(removed);
            
            for(int neigh : adj.get(removed)){
                if(!visited[neigh]){
                    q.add(neigh);
                    visited[neigh] = true;
                }
            }
            
        }
        
        return ans;
        
        
    }
}