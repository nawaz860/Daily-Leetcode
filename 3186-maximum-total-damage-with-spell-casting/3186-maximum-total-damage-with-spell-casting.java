class Solution {

    long[] dp = new long[100003];

    long fun(List<Integer> nums, int i, HashMap<Integer, Integer> m1) {

        if (i >= nums.size()) return 0;

        if (dp[i] != -1) return dp[i];

        int curr = nums.get(i);
        int id = nums.size();

        for (int j = i + 1; j < nums.size(); j++) {
            if (nums.get(j) > curr + 2) {
                id = j;
                break;
            }
        }

        long nottake = fun(nums, i + 1, m1);

        long take = (long)curr * m1.get(curr) + fun(nums, id, m1);

        return dp[i] = Math.max(take, nottake);
    }

     public long maximumTotalDamage(int[] power) {
        HashMap<Integer, Integer> m1 = new HashMap<>();
        for (int a : power) m1.put(a, m1.getOrDefault(a, 0) + 1);

        List<Integer> input = new ArrayList<>(m1.keySet());

        Collections.sort(input);

        Arrays.fill(dp, -1);

        return fun(input, 0, m1);
    }
}