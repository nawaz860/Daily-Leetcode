class Solution {

    void fun(String s,int n, int a, int b,List<String> res){

        if(b>a || a>n || b>n){
            return;
        }

        if(s.length()==2*n){
            res.add(s);
            return ;
        } 

         fun(s+'(',n,a+1,b,res);
         fun(s+')',n,a,b+1,res);
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
         fun("",n,0,0,ans);
        return ans;

    }
}