class Solution {
    public int findFinalValue(int[] nums, int original) {

        int flag=0;

        while(flag==0){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
             original*=2;
             break;
            }
            if(i==nums.length-1) flag+=1;
        }
    }

        return original;
    }
}