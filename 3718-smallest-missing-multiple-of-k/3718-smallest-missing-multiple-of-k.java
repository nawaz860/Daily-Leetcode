class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
       int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n*k) n++;
        }

        return n*k;
    }
}