class Solution {
    public String removeStars(String s) {
        
        String res="";

        for(char ch:s.toCharArray()){
            if(res.length()!=0 && ch=='*') res = res.substring(0, res.length() - 1);
            if(ch!='*') res+=ch;
        }

        return res;
    }
}