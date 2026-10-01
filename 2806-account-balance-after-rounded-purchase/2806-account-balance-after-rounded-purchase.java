class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        int n=purchaseAmount;
        if(n%10<5){
            while(n%10!=0) n--;
        } else{
            while(n%10!=0) n++;
        }

        return 100-n;
    }
}