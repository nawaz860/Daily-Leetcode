class Solution {
    public int maxProductDifference(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max1=max;
                max=nums[i];
            } else if(nums[i]>max1) max1=nums[i];

            if(nums[i]<min){
                min1=min;
                min=nums[i];
            } else if(nums[i]<min1) min1=nums[i];
            
        }

        return (max1*max)-(min1*min);
    }
}