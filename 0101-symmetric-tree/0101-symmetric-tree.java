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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if(p.left!=null && q.right==null || p.right!=null && q.left==null || p.left==null && q.right!=null || p.right==null && q.left!=null){
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        if (p.left != null && q.right != null) {
            if (p.left.val != q.right.val) {
                return false;
            }
        }
        if (p.right != null && q.left != null) {
            if (p.right.val != q.left.val) {
                return false;
            }
        }
        return dfs(p.left, q.right) && dfs(p.right,q.left);
    }
}