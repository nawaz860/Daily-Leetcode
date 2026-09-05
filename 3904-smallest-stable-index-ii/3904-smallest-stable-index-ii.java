class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n=nums.length;
        int[] prefix=new int [n];
        prefix[0]=nums[0];

        for(int i=1;i<n;i++) prefix[i]=Math.max(prefix[i-1],nums[i]);

        int min=Integer.MAX_VALUE;
        int ans=-1;

        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            if(prefix[i]-min<=k) ans=i;
        }

        return ans;
    }
}