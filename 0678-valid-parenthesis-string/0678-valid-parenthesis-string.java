class Solution {
    public boolean checkValidString(String s) {

        if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(') return false;

        int right=0;
        int left=0;
        int star=0;

        for(char ch:s.toCharArray()){

            if(ch=='(') left++;
            if(ch==')') right++;
            if(ch=='*') star++;

            if(right-left>star) return false;
        }

        right=0;
        left=0;
        star=0;

        for(int i=s.length()-1; i>=0; i--){

            char ch=s.charAt(i);

            if(ch==')') right++;
            if(ch=='(') left++;
            if(ch=='*') star++;

            if(left-right>star) return false;
        }

        return true;
    }
}