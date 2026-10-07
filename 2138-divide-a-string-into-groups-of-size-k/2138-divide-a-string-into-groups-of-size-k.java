class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int mod=s.length()%k;
        int fillCount=(k-mod)%k;

        String str=s;
        
        for(int i=0;i<fillCount;i++) str+=fill;

        String[] ans= new String[str.length()/k];


        for(int i=0;i<str.length();i+=k){
            String temp="";
            for(int j=i;j<i+k;j++){
                temp+=str.charAt(j);
            }
            ans[i/k]=temp;
        }

        return ans;
    }
}