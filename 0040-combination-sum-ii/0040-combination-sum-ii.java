class Solution {

    List<List<Integer>> ans=new ArrayList<>();
    int target;

    void fun(int []candidates,int sum, int index, List<Integer> sublist ){
        // base case: sublist ka sum agar target ke equal ho gya then sublist ko ans me add kar denge and return kar jayenge
        if(sum==target){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        // agar sublist ka sum target se bara / index candidates.length ke equal ya bara ho jaye then return kar jayenge
        if(sum>target || index>=candidates.length) return;

        //pick
        sublist.add(candidates[index]);
        fun(candidates,sum+candidates[index],index+1,sublist);
        
        //backtrack
        sublist.remove(sublist.size()-1);
        index++;

        // agar last picked element current element ke equal hai ti skip kar jayenge
        while(index<candidates.length && candidates[index]==candidates[index-1]) index++;

        //not picked
        fun(candidates,sum,index,sublist);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.target=target;

        Arrays.sort(candidates);

        fun(candidates,0,0,new ArrayList<>());

        return ans;
        
    }
}