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
    public TreeNode inOrderSuccessor(TreeNode root){
        if(root.left == null)
            return root;
        
        return inOrderSuccessor(root.left);
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            // case 1 - no child
            if(root.left == null && root.right == null)
                return null;
            
            // case 2 - 1 child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            
            // case 3 - 2 children
            TreeNode IS = inOrderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }
        return root;
    }
}