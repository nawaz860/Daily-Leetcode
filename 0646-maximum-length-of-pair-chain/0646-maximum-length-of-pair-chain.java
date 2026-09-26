class Solution {
    int[] dp= new int[1001];

    int fun(int[][]nums, int i){

        if(i>=nums.length) return 0;

        int id=nums.length;

        if(dp[i]!=-1) return dp[i];

         for(int j=i+1;j<nums.length;j++){
       if(nums[j][0]>nums[i][1]){
             id=j;
             break;
         }
     }

       /* int l=i+1;
        int h=nums.length-1;

         while(l<=h){
        int mid=(l+h)/2;
        if(nums[mid][0]>nums[i][1]){
            id=mid;
            h=mid-1;
        }else l=mid+1;
    }*/

    int t=1+fun(nums,id);
    int nt=fun(nums,i+1);

    return dp[i]=Math.max(t,nt);

    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.fill(dp,-1);

        return fun(pairs,0);
        
    }
}