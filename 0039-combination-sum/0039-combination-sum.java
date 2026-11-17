class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        backtrack(candidates,target,list,l,0,0);
        return list;
    }
    void backtrack(int[] candidates,int target,List<List<Integer>> list,List<Integer> l,int index,int total){
        if(total==target){
            list.add(new ArrayList<>(l));
            return;
        }
        if(index==candidates.length || total>target){
            return;
        }
        l.add(candidates[index]);
        backtrack(candidates,target,list,l,index,total+candidates[index]);
        l.remove(l.size()-1);
        backtrack(candidates,target,list,l,index+1,total);
    }
}