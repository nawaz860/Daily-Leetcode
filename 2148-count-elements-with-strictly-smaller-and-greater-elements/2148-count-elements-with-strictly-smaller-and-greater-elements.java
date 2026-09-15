class Solution {
    public int countElements(int[] nums) {

        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];

        if(min==max) return 0;

        int count=0;

        for(int num: nums) {
            if(num==max) count++;
            if(num==min) count++;
        }

        return nums.length-count;
    }
}

