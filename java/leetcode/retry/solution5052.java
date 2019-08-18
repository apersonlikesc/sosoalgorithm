package leetcode.retry;

import java.util.LinkedList;

public class solution5052 {
    public int maxLevelSum(TreeNode root) {
        if(root == null)
        {
            return -1;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        int value = root.val;
        int min = 1;
        int ret = 1;
        while(!queue.isEmpty())
        {
            int v = 0;
            int num = queue.size();
            while(num-- > 0){
                TreeNode node = queue.poll();
                if(node.left!=null)
                {
                    queue.offer(node.left);
                    v = v+node.left.val;
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                    v = v+node.right.val;
                }
            }
            min++;
            if(v>value)
            {
                value = v;
                ret = min;
            }
        }
        return ret;
    }
}
