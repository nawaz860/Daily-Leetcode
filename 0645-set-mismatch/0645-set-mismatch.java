class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        int sum=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            if(nums[i]==nums[i+1]) ans[0]=nums[i];
        }

        int original_sum=nums.length*(nums.length+1)/2;
        int sum_except_duplicate=sum-ans[0];
        ans[1]=original_sum-sum_except_duplicate;

        return ans;

    }
}