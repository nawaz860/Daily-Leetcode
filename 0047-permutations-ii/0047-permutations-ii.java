class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    void fun(List<Integer>nums, List<Integer> temp ){
        if(nums.size()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.size();i++){
            List<Integer> ip=new ArrayList<>(nums);
            List<Integer> op= new ArrayList<>(temp);
            if( i>0 && ip.get(i)==ip.get(i-1)) continue;
            op.add(nums.get(i));
            ip.remove(nums.get(i));

            fun(ip,op);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> input=new ArrayList<>();
        for(int num:nums) input.add(num);
        Collections.sort(input);

        fun(input, new ArrayList<>());

        return ans;
        
    }
}