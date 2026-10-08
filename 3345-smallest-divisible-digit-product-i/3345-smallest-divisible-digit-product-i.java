class Solution {

    boolean isDivisible(int num, int t){
            int prod=1;

            while(num>0){
                prod*=num%10;
                num/=10;
            }
            return prod%t==0;
        }
    public int smallestNumber(int n, int t) {
        int ans=0;

        for(int i=n;;i++){
            if(isDivisible(i,t)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}