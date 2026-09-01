class Solution {
    public String mergeAlternately(String word1, String word2) {
        String solution="";

        for(int i=0;i<Math.min(word1.length(),word2.length());i++){
            solution+=word1.charAt(i);
            solution+=word2.charAt(i);
        }
        
        if(word1.length()<word2.length()){
            for(int i=word1.length();i<word2.length();i++) solution+=word2.charAt(i);
        }

        if(word2.length()<word1.length()){
            for(int i=word2.length();i<word1.length();i++) solution+=word1.charAt(i);
        }

        return solution;
    }
}