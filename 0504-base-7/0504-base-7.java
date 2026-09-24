class Solution {
    public String convertToBase7(int num) {

        if(num==0) return "0";
        
        int n=Math.abs(num);

        String ans="";

        while(n>0){
            int digit=n%7;
           ans+= (char)('0' + digit); 
            n/=7;
        }

        if(num<0) ans+='-';

        return  new StringBuilder(ans).reverse().toString();
    }
}