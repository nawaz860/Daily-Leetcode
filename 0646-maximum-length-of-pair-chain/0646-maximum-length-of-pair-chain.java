class Solution {

    int [][] dp = new int [1002][1002];

    int fun(int [][] pairs,int prev, int i){
        if(i>=pairs.length) return 0;

        if(dp[prev+1][i]!=-1) return dp[prev+1][i];

        int m=0;

        if(prev==-1 || pairs[i][0] > pairs[prev][1]){
            int a=1+fun(pairs,i,i+1);
            m=Math.max(m,a);
        }

        int b=fun(pairs,prev,i+1);
        m=Math.max(m,b);

        return dp[prev+1][i]=m;

    }

    public int findLongestChain(int[][] pairs) {
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        return fun(pairs,-1,0);
    }
}