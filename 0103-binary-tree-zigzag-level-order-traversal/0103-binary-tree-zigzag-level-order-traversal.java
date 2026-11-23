/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode r=q.poll();
                l.add(r.val);
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
            }
            list.add(new ArrayList<>(l));
        }
        return func();
    }
    List<List<Integer>> func(){
        int i=0;
        while(i<list.size()){
            if(i%2!=0){
                Collections.reverse(list.get(i));
            }
            i++;
        }
        return list;
    }
}