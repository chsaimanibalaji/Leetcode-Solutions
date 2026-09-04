import java.util.Stack;
/*class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        int i = 0, j = 0;
        while (i < temperatures.length - 1) {
            j = i + 1;
            Stack<Integer> stack = new Stack<>();
            while (j < temperatures.length && temperatures[i] >= temperatures[j]) {
                stack.add(temperatures[j]);
                j++;
            }
               if (j < temperatures.length) {
                arr[i] = stack.size() + 1;
            } else {
                arr[i] = 0;
            }
            i++;
        }
        return arr;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[temperatures.length];
        int i=arr.length-1;
        while(i>=0){
            if(stack.empty()){
                arr[i]=0;
                stack.push(temperatures[i]);
            }
            else{
                while(!stack.empty() && stack.peek()<=temperatures[i]){
                    int x=stack.pop();
                }
                stack.push(temperatures[i]);
                arr[i]=stack.size();
            }
            i--;
        }
        return arr;
    }
}*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        // Stack stores indices, not temperature values
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While current temperature is warmer than the temperature 
            // at the index saved at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex; // Calculate days waited
            }
            stack.push(i);
        }

        return result;
    }
}