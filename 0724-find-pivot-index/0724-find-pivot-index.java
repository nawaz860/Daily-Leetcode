class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum_left=0;
            int sum_right=0;
            for(int j=0;j<i;j++) sum_left+=nums[j];
            for(int j=i+1;j<nums.length;j++) sum_right+=nums[j];
            if(sum_left==sum_right) return i;
        }

        return -1;
    }
}