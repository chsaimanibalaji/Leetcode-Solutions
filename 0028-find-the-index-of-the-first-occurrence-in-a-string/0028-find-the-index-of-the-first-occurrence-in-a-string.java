class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        else{
            int i=0,j=0;
            while(i<=haystack.length() && j<haystack.length()){
                if(needle.equals(haystack.substring(i,j+1))){
                    return i;
                }
                j++;
                if(j-i+1>needle.length()){
                    i++;
                    j=i;
                }
            }
        }
        return -1;
    }
}