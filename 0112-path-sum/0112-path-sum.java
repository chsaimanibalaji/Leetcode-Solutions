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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPath(root,targetSum,0);
    }
    boolean hasPath(TreeNode root,int targetSum,int sum){
        if(root==null){
            return false;
        }
        if(sum+root.val==targetSum && root.left==null && root.right==null){
            return true;
        }
        return hasPath(root.left,targetSum,sum+root.val)||hasPath(root.right,targetSum,sum+root.val);
    }
    }