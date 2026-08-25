class Solution {

    List<List<Integer>> ans= new ArrayList<>();
    int target;

    void fun(int [] candidates, int sum, int index, List<Integer> sublist){
        if(sum==target) {
            ans.add(new ArrayList<>(sublist));
            return;
        }
        if(sum>target || index>=candidates.length) return;

        sublist.add(candidates[index]);
        fun(candidates,sum+candidates[index],index,sublist);

        sublist.remove(sublist.size()-1);
        fun(candidates,sum,index+1,sublist);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target=target;
        fun(candidates,0,0,new ArrayList<>());
        return ans;
        
    }
}