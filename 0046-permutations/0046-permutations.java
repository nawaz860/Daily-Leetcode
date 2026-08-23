class Solution {

    List<List<Integer>> answer = new ArrayList<>();

    void fun(List<Integer> nums, List<Integer> temp) {
        if (nums.size() == 0) {
            answer.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);
            op.add(nums.get(i));
            ip.remove(i);

            fun(ip, op);

        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<Integer> input = new ArrayList<>();
        for (int num : nums)
            input.add(num);

        fun(input, new ArrayList<>());

        return answer;

    }
}