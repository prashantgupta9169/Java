###Graph using Java ###
### BFS ###
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList < > ();
        boolean vis[] =new boolean[V];
        Queue<Integer> q= new LinkedList<>();
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for(Integer nbr:adj.get(node)){
                if(vis[nbr]==false){
                    vis[nbr]=true;
                    q.add(nbr);
                }
            }
        }
        return bfs;
    }
}

### DFS ###
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        vis[node]=true;
        ans.add(node);
        for(Integer nbr:adj.get(node)){
            if(vis[nbr]==false){
                dfs(nbr,vis,adj,ans);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(0,vis,adj,ans);
        return ans;
    }
}
