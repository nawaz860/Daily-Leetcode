class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int fst=Integer.MAX_VALUE;
        int snd=Integer.MAX_VALUE;

        //Array ke every element ko one-by-one check karenge
        for(int num:nums){

            // agar current number 1st se chota ya equal hia
            // to current ko 1st bana denge 
            //Q ke 1st me sabse chota chahiye;
            if(num<=fst) fst=num;

            //Agar current number 1st se bada hai 
            //lekin 2nd se chhota ya equal hai 
            //toh current number ko 2nd bana denge;
            else if(num<=snd) snd=num;

            //agar current number 2nd se bhi bara hai
            //matlab hame 1st<2nd<3rd mil gya 
            //so true return kar denge 
            else return true;
        }

        // Agar poora array check karne ke baad bhi
        // increasing triplet nahi mila
        return false;
    }
}