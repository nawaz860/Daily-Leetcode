class Solution {

    int [][] dp= new int[201][201];

    int fun(int[][] grid, int m, int n, int i, int j){

        if(i>=m || j>=n) return 10000000;

        if(i==m-1 && j==n-1) return grid[i][j];

        if(dp[i][j]!=-1) return dp[i][j];

        int a=grid[i][j]+fun(grid,m,n,i+1,j);
        int b=grid[i][j]+fun(grid,m,n,i,j+1);

        return dp[i][j]= Math.min(a,b);
    }
    public int minPathSum(int[][] grid) {

        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1);

        int m=grid.length;
        int n=grid[0].length;

        return fun(grid,m,n,0,0);
        
    }
}