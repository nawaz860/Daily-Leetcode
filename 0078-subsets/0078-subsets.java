class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums, 0, new ArrayList<>());
        return result;
    }

    public void findSubsets(int nums[], int index, List<Integer> sublist) {
        // base case
        if (index == nums.length) {
            result.add(new ArrayList<>(sublist));
            return;
        }
        //pick
        sublist.add(nums[index]);
        findSubsets(nums, index + 1, sublist);
        //while backtrack we need to remove the last added element
        sublist.remove(sublist.size() - 1);

        //no pick
        findSubsets(nums, index + 1, sublist);
        //since we dont added any element so, we dont need to remove any element while backtrack

    }
}