class Solution {

    int[][] dp= new int[101][101];


    int fun(int [][]grid, int i, int j){
        int n=grid.length;


        if(i>=n || j>=n || i<0 || j<0) return 100000;
        if(i==n-1) return grid[i][j];

        if(dp[i][j]!=-100000) return dp[i][j];



        int a=grid[i][j]+fun(grid,i+1,j-1);
        int b=grid[i][j]+fun(grid,i+1,j);
        int c=grid[i][j]+fun(grid,i+1,j+1);

        return dp[i][j]= Math.min(a,Math.min(b,c));



    }
    public int minFallingPathSum(int[][] matrix) {
        for(int i=0;i<101;i++) Arrays.fill(dp[i],-100000);

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            ans=Math.min(ans,fun(matrix,0,i));
        }
        return ans;
        
    }
}