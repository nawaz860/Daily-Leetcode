class Solution {

    // fution jo binary ko decimal me change karega and check jarega if power of 5
    boolean fun(String str){

        if(str.charAt(0)=='0') return false; //leading 0 nhi hona chahiye

        int a=1;
        int num=0;

        //binary to decimal 
        for (int i = str.length()-1; i >= 0; i--) {
            num += (str.charAt(i) - '0') * a;
            a *= 2;
        }

        // Check if power of 5
        while (num % 5 == 0) {
            num /= 5;
        }

        return num==1;  //if num 1 ke equal ho gya to power of five hoga and we will return "true" otherwise "false"
    }

    int[] dp=new int[20]; //memorization for storing repetative similar subproblems 

    // recursive function beautiful substring find karne ke liye
    int solve(String s, int i){
            if(i==s.length()) return 0; // agar string ke end tak pahooch gye to 0 return kar denge

            if(dp[i]!=-1) return dp[i]; // agar dp[i] already calculated hai to value return kar denge

            int ans= Integer.MAX_VALUE;

            String str="";

            //sabhi possible substring ko try karenge;
            for(int j=i;j<s.length();j++){
                str+=s.charAt(j);

                //check karenge if crrent string beautiful hai
                if(fun(str)){
                    int next=solve(s,j+1);

                    //agar remaining part possible hai
                    if(next!=Integer.MAX_VALUE){
                        ans=Math.min(ans,1+next);
                    }
                }
            }
                return dp[i]=ans;

    }

    public int minimumBeautifulSubstrings(String s) {

        Arrays.fill(dp,-1);
        
        int ans=solve(s,0);
        
        if(ans==Integer.MAX_VALUE) return -1;

        return ans;
        
    }
}