class Solution {
    public int minMoves(int[] nums) {

        int count=0;
        
        int max=nums[0];
        
        for(int num:nums) max=Math.max(num,max);

        for(int num:nums) if(num!=max) count+=(max-num);

        return count;

    }
}