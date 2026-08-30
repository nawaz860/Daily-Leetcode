class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product=1;
        int product2=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            if(nums[i]!=0) product2*=nums[i];
            if(nums[i]==0) count++;
        }

        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                ans[i]=product2;
            } else ans[i]=product/nums[i];
    
        }

        int [] ans2=new int[nums.length];
        for(int i=0;i<nums.length;i++) ans2[i]=0;

            if(count>1) return ans2;
            
        return ans;     
    }
}