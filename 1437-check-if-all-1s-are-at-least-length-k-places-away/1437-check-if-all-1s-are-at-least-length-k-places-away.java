
class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int ones = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                ones = i;
                break;
            }
        }

        for(int i = ones + 1; i < nums.length; i++){

            if(nums[i] == 1){
                if(i - ones - 1 >= k){
                    ones = i;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
