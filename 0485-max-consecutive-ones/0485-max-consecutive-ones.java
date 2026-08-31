class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 temp++;
                 max1 = Math.max(max1, temp);
            } else temp=0;
            }

            return max1;
            
    }
}