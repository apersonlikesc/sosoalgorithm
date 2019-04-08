package nowcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution32_2 {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        ((LinkedList<TreeNode>) queue).add(pRoot);
        while(!queue.isEmpty())
        {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while(cnt-->0)
            {
                TreeNode t = queue.poll();
                if(t == null)
                {
                    continue;
                }
                list.add(t.val);
                ((LinkedList<TreeNode>) queue).add(t.left);
                ((LinkedList<TreeNode>) queue).add(t.right);
            }
            if (list.size()!=0)
            {
                ret.add(list);
            }
        }
        return ret;
    }
}
