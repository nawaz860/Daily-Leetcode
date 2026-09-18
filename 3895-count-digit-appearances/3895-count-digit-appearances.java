class Solution {

    int countDigit(int num, int k){
        int count =0;
        while(num>0){
            int digit=num%10;
            if(digit==k) count++;
            num/=10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {

        int ans=0;

        for(int num:nums) ans+=countDigit(num,digit);

        return ans;
        
    }
}