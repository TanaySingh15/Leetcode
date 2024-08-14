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
    public int diameterOfBinaryTree(TreeNode root) {
        Pair p = diameter(root);
        return p.diameter;
    }

    Pair diameter(TreeNode node){
        if(node==null)return new Pair(0,0);
        Pair left = diameter(node.left);
        Pair right = diameter(node.right);
        int height = 1+Math.max(left.height,right.height);
        int diameter = Math.max(right.diameter,Math.max(left.diameter,left.height+right.height));
        return new Pair(height,diameter);
    }
}

class Pair{
    int height;
    int diameter;
    Pair(int h,int d){
        height = h;
        diameter = d;
    }
}