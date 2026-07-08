/*class Solution {
    public int numRescueBoats(int[] people, int limit) {
        List<List<Integer>> list=new ArrayList<>();
        int i=0,j=1;
        while(i<people.length){
            if(people[i]==limit){
                List<Integer> l=new ArrayList<>();
                l.add(people[i]);
                list.add(l);
                i++;
                j=i+1;
            }
            else if(people[i]+people[j]<=limit && j<people.length){
                List<Integer> l=new ArrayList<>();
                l.add(people[i]);
                int x=people[i];
                while(x+people[j]<=limit && j<people.length){
                    x+=people[j];
                    l.add(people[j]);
                    j++;
                }
                list.add(l);
                i=j;
            }
        }
        return list.size();
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat=0;
        int i=0,j=people.length-1;
        while(i<j){
            if(people[i]+people[j]<=limit){
                boat++;
            }
            else if(people[i]+people[j]>limit){
                    boat=boat+2;
            }
            i++;
            j--;
        }
        return boat;
    }
}*/
import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }
}