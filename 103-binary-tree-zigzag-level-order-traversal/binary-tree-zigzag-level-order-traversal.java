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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        int flag = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> l = new ArrayList<>();
            flag = -1 * flag;
            for(int i=0;i<size;i++){
                TreeNode n = queue.poll();
                System.out.print(n.val+" ");
                l.add(n.val);
                if(flag == -1){
                    if(n.left!=null) stack.push(n.left);
                    if(n.right!=null) stack.push(n.right);
                } else {
                    if(n.right!=null) stack.push(n.right);
                    if(n.left!=null) stack.push(n.left);
                }
            }
            ans.add(l);
            while(!stack.isEmpty()) queue.add(stack.pop());
            System.out.println();
        }
        return ans;
    }
}