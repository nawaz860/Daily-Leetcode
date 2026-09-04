class Solution {
    public int compareBitonicSums(int[] nums) {

        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }

        long sum1=0;
        long sum2=0;
        for(int i=0;i<=index;i++) sum1+=nums[i];
        for(int i=index;i<nums.length;i++) sum2+=nums[i];

        if(sum1>sum2) return 0;
        if(sum2>sum1) return 1;
        return -1;
    }
}