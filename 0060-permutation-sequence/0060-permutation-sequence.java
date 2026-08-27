class Solution {

    List<Integer> answer = new ArrayList<>();
    int count = 0;

    void fun(List<Integer> nums, List<Integer> temp, int k) {
        if (nums.size() == 0) {
            count++;

            if (count == k) answer = new ArrayList<>(temp);
            return;
        }

        for (int i = 0; i < nums.size(); i++) {

            if(count==k) return;
            
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);

            op.add(nums.get(i));
            ip.remove(i);

            fun(ip, op, k);

        }
    }

    public String getPermutation(int n, int k) {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            input.add(i);

        fun(input, new ArrayList<>(), k);

        int num = 0;
        for (int i : answer)  num = num * 10 + i;

        return String.valueOf(num);

    }
}