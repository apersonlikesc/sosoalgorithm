package leetcode.retry;

public class solution104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left<right)
        {
            return right+1;
        }else{
            return left+1;
        }
    }
}
