class Solution {
    public int scoreOfString(String s) {
        int x=0,i=0;
        for(i=0;i<s.length()-1;i++){
            x+=Math.abs(s.charAt(i+1)-s.charAt(i));
        }
        return x;
    }
}