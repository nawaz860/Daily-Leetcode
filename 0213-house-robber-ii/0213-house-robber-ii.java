class Solution {
    
    int [][]dp=new int[102][2];

    int fun(int[]nums, int i, int f){
        if(i==nums.length-1){
            if(f==1){
                return 0;
            }
            return nums[i];
        }

        if(dp[i][f]!=-1) return dp[i][f];

        if(i>=nums.length) return 0;

        int nf=f;
        if(i==0) nf=1;

        int rob=nums[i]+fun(nums,i+2,nf);
        int notrob=fun(nums,i+1,f);
        

       return dp[i][f]= Math.max(rob,notrob);
    }
    public int rob(int[] nums) {

        for(int i=0;i<dp.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        } 

        return fun(nums,0,0);
        
    }
}