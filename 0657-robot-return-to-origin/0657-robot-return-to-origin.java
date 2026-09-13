class Solution {
    public boolean judgeCircle(String moves) {
        int i=0,x=0,y=0;
        while(i<moves.length()){
            if(moves.charAt(i)=='U'){
                y=y+1;
            }
            else if(moves.charAt(i)=='D'){
                y=y-1;
            }
            else if(moves.charAt(i)=='L'){
                x=x+1;
            }
            else if(moves.charAt(i)=='R'){
                x=x-1;
            }
            i++;
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}