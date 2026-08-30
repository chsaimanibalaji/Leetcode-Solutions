class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(!(operations[i].equals("C")||operations[i].equals("D")||operations[i].equals("+"))){
                stack.push(Integer.valueOf(operations[i]));
                sum+=Integer.valueOf(operations[i]);
            }
            else if(operations[i].equals("C")){
                int x=stack.pop();
                sum-=x;
            }
            else if(operations[i].equals("D")){
                int x=stack.peek();
                stack.push(2*x);
                sum+=2*x;
            }
            else if(operations[i].equals("+")){
                int x=stack.pop();
                int y=stack.peek();
                stack.push(x);
                int new_sum=x+y;
                stack.push(new_sum);
                sum+=new_sum;
            }
        }
        return sum;
    }
}