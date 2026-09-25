class Solution {
    public boolean checkRecord(String s) {
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L') return false;
        }
        int ab=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') ab+=1;
        }

        if(ab<2) return true;

        return false;
    }
}