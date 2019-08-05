package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution32 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            int cnt = queue.size();
            while(cnt-->0)
            {
                TreeNode t = queue.poll();
                if(t == null)
                {
                    continue;
                }
                ret.add(t.val);
                ((LinkedList<TreeNode>) queue).add(t.left);
                ((LinkedList<TreeNode>) queue).add(t.right);
            }
        }
        return ret;
    }
}
