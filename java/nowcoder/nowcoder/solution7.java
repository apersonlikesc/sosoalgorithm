package nowcoder;

import java.util.HashMap;
import java.util.Map;

public class solution7 {
    private Map<Integer,Integer> indexForInOrders = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        for(int i = 0;i<in.length;i++)
        {
            indexForInOrders.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length,0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int prel, int prer, int inl) {
        if(prel>prer)
        {
            return null;
        }
        TreeNode root = new TreeNode(pre[prel]);
        int inindex = indexForInOrders.get(root.val);
        int leftTreeSize = inindex - inl;
        root.left = reConstructBinaryTree(pre,prel+1,prel+leftTreeSize,inl);
        root.right = reConstructBinaryTree(pre,prel+leftTreeSize+1,prer,inl+leftTreeSize+1);
        return root;
    }
}
