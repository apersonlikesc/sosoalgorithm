package leetcode.retry;

public class solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode node=null;
        if(t1==null)
        {
            if(t2==null)
            {
                return null;
            }else{
                return t2;
            }
        }
        if(t2==null)
        {
            return t1;
        }
        node = new TreeNode(t1.val+t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
    }
}
