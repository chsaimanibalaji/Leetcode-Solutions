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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(root.left==null && val<root.val){
            root.left=new TreeNode(val);
            return root;
        }
        if(root.right==null && val>root.val){
            root.right=new TreeNode(val);
            return root;
        }
        if(root.val<val){
             insertIntoBST(root.right,val);
             return root;
        }
        else{
             insertIntoBST(root.left,val);
             return root;
        }
    }
}