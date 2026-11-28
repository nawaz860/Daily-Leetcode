class Solution {

    void dfs(int start, int [][] isConnected, boolean[] vis){
        vis[start]=true;
        
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[start][i]==1 && !vis[i]) dfs(i,isConnected,vis);
        }
    }
    public int findCircleNum(int[][] isConnected) {

        boolean [] vis= new boolean[isConnected.length];

        int count=0;
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                count++;
                dfs(i,isConnected,vis);
            }
        }

        return count;  
    }
}