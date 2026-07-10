class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0;
        int min_len=Math.min(word1.length(),word2.length());
        for(i=0;i<min_len;i++){
                ans+=word1.charAt(i);
                ans+=word2.charAt(i);
        }
        if(word1.length()>word2.length()){
            while(i<word1.length()){
                ans+=word1.charAt(i);
                i++;
            }
        }
        if(word1.length()<word2.length()){
            while(i<word2.length()){
                ans+=word2.charAt(i);
                i++;
            }
        }
        return ans;
    }
}