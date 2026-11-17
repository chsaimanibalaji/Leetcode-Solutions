class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,list,l,0,0);
        return list;
    }
    void backtrack(int[] candidates,int target,List<List<Integer>> list,List<Integer> l,int i,int total){
        if(total==target){
            list.add(new ArrayList<>(l));
            return;
        }
        if(target<total || i==candidates.length){
            return;
        }
        l.add(candidates[i]);
        backtrack(candidates,target,list,l,i+1,total+candidates[i]);
        l.remove(l.size()-1);
        int next=i+1;
        while(next<candidates.length && candidates[i]==candidates[next]){
            next++;
        }
        backtrack(candidates,target,list,l,next,total);
    }
}