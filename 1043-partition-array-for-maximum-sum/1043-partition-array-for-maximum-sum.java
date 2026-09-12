class Solution {

    int [][] dp= new int [505][505];
    int fun(int[]arr,int p,int i,int m,int k){
        if(i>=arr.length) return 0;

        if(dp[i][p]!=-1) return dp[i][p];

        int ans=0;
       m=Math.max(m,arr[i]);
       int len=i-p+1;
    if(len==k){
        int a=(m*len)+fun(arr,i+1,i+1,0,k);
        ans=Math.max(ans,a);
    }else{
        int a=(m*len)+fun(arr,i+1,i+1,0,k);
        int b=fun(arr,p,i+1,m,k);
        ans=Math.max(ans,a);
        ans=Math.max(ans,b);
    }
        return dp[i][p]=ans;
    
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for (int i = 0; i < 505; i++) Arrays.fill(dp[i], -1);

        return fun(arr,0,0,0,k);
}
}