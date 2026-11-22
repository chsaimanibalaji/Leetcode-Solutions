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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        return dfs(list,root,String.valueOf(root.val));
    }
    List<String> dfs(List<String> l,TreeNode root,String s){
        if(root==null || (root.left==null && root.right==null)){
            l.add(s);
            return l;
        }
        if(root.left!=null){
             dfs(l,root.left,s+"->"+root.left.val);
        }
        if(root.right!=null){
             dfs(l,root.right,s+"->"+root.right.val);
        }
        return l;
    }
}