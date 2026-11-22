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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int ans=root.val;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                TreeNode r=q.poll();
                if(r.left!=null){
                    q.add(r.left);
                    if(flag==false){
                    ans=r.left.val;
                    flag=true;
                    }
                }
                if(r.right!=null){
                    q.add(r.right);
                    if(flag==false){
                        ans=r.right.val;
                        flag=true;
                    }
                }
            }
        }
        return ans;
    }
}