/*import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                int y=stack.peek();
                if(y+asteroids[i]>0){
                    continue;
                }
                else if(asteroids[i]+y==0){
                    stack.pop();
                    continue;
                }
                while(!stack.empty() && asteroids[i]+stack.peek()<0){
                    int x=stack.pop();
                }
                stack.push(asteroids[i]);
            }
        }
        while(!stack.empty()){
            list.add(stack.pop());
        }
        Integer[] array = list.toArray(Integer[]::new);
        int[] narr=new int[array.length];
        for(int i=0;i<narr.length;i++){
            narr[i]=array[array.length-i-1];
        }
        return narr;
    }
}*/
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                // Pop all smaller positive asteroids moving right
                while (!stack.empty() && stack.peek() > 0 && stack.peek() < -asteroids[i]) {
                    stack.pop();
                }
                
                // If equal size, both destroy each other
                if (!stack.empty() && stack.peek() > 0 && stack.peek() == -asteroids[i]) {
                    stack.pop();
                } 
                // Push if no right-moving positive asteroid is left to stop it
                else if (stack.empty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                }
            }
        }
        
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        
        Integer[] array = list.toArray(Integer[]::new);
        int[] narr = new int[array.length];
        for (int i = 0; i < narr.length; i++) {
            narr[i] = array[array.length - i - 1];
        }
        
        return narr;
    }
}