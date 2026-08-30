class Solution {
    public int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int min_indx = 0;
        int max_indx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                min_indx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                max_indx = i;
            }
        }

        int a = (min_indx + 1) + (nums.length - max_indx);
        int b = (max_indx + 1) + (nums.length - min_indx);

        int c = Math.max(min_indx, max_indx) + 1;

        int d = nums.length - Math.min(min_indx, max_indx);

        int x = Math.min(a, b);
        int y = Math.min(c, d);

        return Math.min(x, y);
    }
}