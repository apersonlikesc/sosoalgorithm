package nowcoder.retry;

public class solution8 {
    public TreeNode GetNext(TreeNode pNode)
    {
        if(pNode.right!=null)
        {
            TreeNode node = pNode.right;
            while(node.left!=null)
            {
                node = node.left;
            }
            return node;
        }else{
            TreeNode parent = pNode.next;
            while(pNode.next!=null&&pNode != parent.left)
            {
                pNode = parent;
                parent = parent.next;
            }
            return parent;

        }
    }
}
