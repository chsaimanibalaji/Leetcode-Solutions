class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++")){
                x++;
                continue;
            }
            else if(operations[i].equals("++X")){
                ++x;
                continue;
            }
            else if(operations[i].equals("--X")){
                --x;
                continue;
            }
            else if(operations[i].equals("X--")){
                x--;
                continue;
            }
        }
        return x;
    }
}