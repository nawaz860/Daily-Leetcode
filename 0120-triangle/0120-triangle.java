class Solution {

    int [][] dp= new int[201][201];

    int fun(List<List<Integer>> triangle, int i, int j){

        int m=triangle.size();
        int n=triangle.get(i).size();

        if(i==m-1) return  triangle.get(i).get(j);

        if(i>=n || j>=m) return 100000;

        if(dp[i][j]!=-100000) return dp[i][j];

        int a=triangle.get(i).get(j)+fun(triangle,i+1,j);
        int b=triangle.get(i).get(j)+fun(triangle,i+1,j+1);

        return dp[i][j]=Math.min(a,b);

        
    }
    public int minimumTotal(List<List<Integer>> triangle) {

        for(int i=0;i<201;i++) Arrays.fill(dp[i],-100000);

        return fun(triangle,0,0);
        
    }
}