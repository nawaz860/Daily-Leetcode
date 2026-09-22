class Solution {
    
    int[][]dp=new int[105][105];

    int fun(int m, int n,int i, int j){
        if(i==n-1 && j==m-1) return 1;

        if(i>=n || j>=m) return 0;

        

        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=fun(m,n,i+1,j)+fun(m,n,i,j+1);

    }
    public int uniquePaths(int m, int n) {

        for(int k=0;k<101;k++) Arrays.fill(dp[k],-1);

        return fun(m,n,0,0);
    }
}