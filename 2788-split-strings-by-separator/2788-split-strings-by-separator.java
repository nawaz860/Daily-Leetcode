class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String>res= new ArrayList<>();

        String wordconcet="";

        for(int i=0;i<words.size();i++){
            if(i!=words.size()-1){
                wordconcet+=words.get(i)+separator;
            } else wordconcet+=words.get(i);
        }

        String s="";
        for(char ch:wordconcet.toCharArray()){
            if(ch!=separator){
                s+=ch;
            } else{
                if(!s.equals(""))res.add(s);
                s="";
            }
        }

        if (!s.equals("")) res.add(s);

        return res;
    }
}