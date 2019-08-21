package leetcode.retry;

import com.sun.source.tree.Tree;

public class solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
