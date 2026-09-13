class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int index=word.indexOf(ch);
        for(int i=index;i>=0;i--){
            s+=word.charAt(i);
        }
        for(int i=index+1;i<word.length();i++){
            s+=word.charAt(i);
        }
        return s;
    }
}