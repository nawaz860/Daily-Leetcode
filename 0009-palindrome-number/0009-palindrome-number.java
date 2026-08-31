class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        for(int i=x;i>0;i=i/10){
            reverse=reverse*10+(i%10);
        }
        if(x==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}