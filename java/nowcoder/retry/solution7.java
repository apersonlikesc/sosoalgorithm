package nowcoder.retry;

import java.util.HashMap;

public class solution7 {
    HashMap<Integer,Integer> hashMap = new HashMap<>();//存放中序节点的下标
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        for(int i = 0;i<in.length;i++)
        {
            hashMap.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int preL,int preR,int inL) {
        if(preL>preR)
        {
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int index = hashMap.get(root.val);
        int LeftSize = index - inL;//左子树的大小,为了获得右子树的开始
        root.left = reConstructBinaryTree(pre,preL+1,preL+LeftSize,inL);
        root.right =reConstructBinaryTree(pre,preL+LeftSize+1,preR,inL+LeftSize+1);
        return root;
    }
}
