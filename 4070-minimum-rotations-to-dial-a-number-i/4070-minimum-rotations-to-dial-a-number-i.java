class Solution {
    public int minRotations(String s) {

        int totalRot=0;
        int prev=0;
        
        for(char ch:s.toCharArray()){
             int num=ch-'0';
             int diff=Math.abs(num-prev);
             int rot=Math.min(diff,10-diff);
             totalRot+=rot;
             prev=num;
        }
            
            return totalRot;
    }
}