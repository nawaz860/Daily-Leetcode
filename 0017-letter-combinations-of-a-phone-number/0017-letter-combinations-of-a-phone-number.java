class Solution {

    String[] keypad={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    } ;

    List<String> result=new ArrayList<>();

    void fun(String digits, int index, String current){
        if(index==digits.length()){
            result.add(current);
            return;
        }

            int digit=digits.charAt(index)-'0';
            String latters=keypad[digit];
            for(char ch:latters.toCharArray()){
                fun(digits,index+1,current+ch);
            }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return result;

        fun(digits,0,"");

        return result;

        
    }
}