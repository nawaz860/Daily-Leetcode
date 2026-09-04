class Solution {

    int [] dp= new int[38];

    int fun(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        if(dp[n]!=-1) return dp[n];
        int ans=fun(n-1)+fun(n-2)+fun(n-3);
        dp[n]=ans;
        return ans;
    }
    public int tribonacci(int n) {
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        return fun(n);
    }
}