class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,list,l,0);
        return list;
    }
    void backtrack(int[] nums,List<List<Integer>> list,List<Integer> l,int i){
        if(nums.length==i){
            if(!list.contains(l)){
               list.add(new ArrayList<>(l));}
            return;
        }
        l.add(nums[i]);
        backtrack(nums,list,l,i+1);
        l.remove(l.size()-1);
        backtrack(nums,list,l,i+1);
    }
}