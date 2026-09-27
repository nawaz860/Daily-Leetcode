class Solution {
    public int[] rearrangeArray(int[] nums) {

    ArrayList<Integer> list= new ArrayList<>();

    for(int num: nums) list.add(num);

    ArrayList<Integer> ans= new ArrayList<>();

     while(!list.isEmpty()){

         HashSet<Integer> set= new HashSet<>(list);

         ArrayList<Integer> unique= new ArrayList<>(set);

         Collections.sort(unique);

         ans.addAll(unique);

         for(int num:unique) list.remove(Integer.valueOf(num));
     }

        int[] result= new int[nums.length];

        for(int i=0;i<ans.size();i++) result[i]=ans.get(i);

        return result;
    }
}