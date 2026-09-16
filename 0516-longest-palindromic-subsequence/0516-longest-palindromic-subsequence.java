class Solution {

    int[][] dp= new int[1001][1001];

    int fun(String s, int i, int j){
        if(i>j) return 0;
        if(i==j) return 1;

        if(dp[i][j]!=-1) return dp[i][j];

        int m=0;

        if(s.charAt(i)==s.charAt(j)){
            int a=2+fun(s,i+1,j-1);
            m=Math.max(m,a);
        } else{
            int a=fun(s,i+1,j);
            int b=fun(s,i,j-1);
            m=Math.max(m,Math.max(a,b));
        }

        return dp[i][j]=m;
    }
    public int longestPalindromeSubseq(String s) {

        for(int i=0;i<1001;i++) Arrays.fill(dp[i],-1);

        return fun(s,0,s.length()-1);
        
    }
}