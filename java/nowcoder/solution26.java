package nowcoder;

public class solution26 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null||root2==null)
        {
            return false;
        }
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2)||isSubtreewithRoot(root1,root2);
    }

    private boolean isSubtreewithRoot(TreeNode root1, TreeNode root2) {
        if(root2==null)
        {
            return true;
        }
        if(root1== null)
        {
            return false;
        }
        if(root1.val!=root2.val)
        {
            return false;
        }
        return isSubtreewithRoot(root1.left,root2.left)&&isSubtreewithRoot(root1.right, root2.right);
    }

}
