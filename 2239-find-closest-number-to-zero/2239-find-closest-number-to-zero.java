class Solution {
    public int findClosestNumber(int[] nums) {
        int distance = Integer.MAX_VALUE;
        int ans = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < distance) {
                distance = Math.abs(num);
                ans = num;
            }
            else if (Math.abs(num) == distance && num > ans) ans = num;
        }
        return ans;
    }
}