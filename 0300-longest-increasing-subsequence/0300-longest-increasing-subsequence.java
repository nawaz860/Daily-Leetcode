class Solution {

    int[][] dp= new int[2505][2505];
    int fun(int[] nums, int i, int p){
        if(i>=nums.length) return 0;

        if(dp[i][p+1]!=-1) return dp[i][p+1];

        int m=0;

        if(p==-1 || nums[i]>nums[p]){
            int a = 1+fun(nums,i+1,i);
            m=Math.max(a,m);
        } 
            int a=fun(nums,i+1,p);
            m=Math.max(a,m);

        return dp[i][p+1]=m;

    }
    public int lengthOfLIS(int[] nums) {
        for(int i=0;i<2500;i++) Arrays.fill(dp[i],-1);

        return fun(nums,0,-1);
        
    }
}