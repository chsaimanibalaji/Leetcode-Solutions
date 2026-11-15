class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,0);
        return list;
    }
    void backtrack(List<List<Integer>> list,List<Integer> l,int[] nums,int i){
        if(i==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
            l.add(nums[i]);
            backtrack(list,l,nums,i+1);
            l.remove(l.size()-1);
            backtrack(list,l,nums,i+1);
    }
}