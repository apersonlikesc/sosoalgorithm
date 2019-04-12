package nowcoder;

public class solution55 {
    public int TreeDepth(TreeNode root) {
        return root==null?0:1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
