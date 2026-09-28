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
    static ArrayList<Integer> list=new ArrayList<>();
    static void traversal(TreeNode root){
        if(root==null){
            return;
        }
        else{
            list.add(root.val);
            traversal(root.left);
            traversal(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        traversal(root);
        return list;
    }
}