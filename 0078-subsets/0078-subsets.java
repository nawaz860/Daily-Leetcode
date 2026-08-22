// solution using input output

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    void fun(List<Integer> nums, List<Integer> tmp){
        result.add(new ArrayList<>(tmp));
        if (nums.size() == 0) return;

    for (int i = 0; i < nums.size(); i++){
        List<Integer> ip = new ArrayList<>(nums);
        List<Integer> op = new ArrayList<>(tmp);
        op.add(nums.get(i));
        for (int j = 0; j <= i; j++) ip.remove(0);

        fun(ip,op);

}
    }

    public List<List<Integer>> subsets(int[] nums) {
        result.clear();
        List<Integer> input= new ArrayList<>();
        for(int num:nums) input.add(num);

        List<Integer> tmp = new ArrayList<>();

        fun(input, tmp);

        return result;

        
    }
}