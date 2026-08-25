class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    int target;

    void fun(int [] candidates, int sum,int index, List<Integer> sublist){

        // agar sum target ke equal ho gya to us sublist ko ans me add kar lenge
        if(sum==target){
            ans.add(new ArrayList<>(sublist));
            return;
        } 

        //agar sum target se bara ya index candidate.length se bara ho gya to return kar jayenge
        if(sum>target || index >= candidates.length) return;

        //take 
        sublist.add(candidates[index]);
        //same element ko again le sakte hai isliye index ko increase nhi karenge
        fun(candidates,sum+candidates[index],index,sublist);

        //backtrack karenge and last picked element ko remove karenge
        sublist.remove(sublist.size()-1);

        //pick nhi karenge and index ko 1 se increase kar denge
        fun(candidates,sum,index+1,sublist);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target=target;
        fun( candidates, 0, 0, new ArrayList<>());
        return ans;
        
    }
}