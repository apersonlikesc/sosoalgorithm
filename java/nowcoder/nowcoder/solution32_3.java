package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class solution32_3 {
        public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            ((LinkedList<TreeNode>) queue).add(pRoot);
            boolean reverse = false;
            while(!queue.isEmpty())
            {
                int count = queue.size();
                ArrayList<Integer> list = new ArrayList<>();
                while(count-->0)
                {
                    TreeNode t = queue.poll();
                    if(t==null)
                    {
                        continue;
                    }
                    list.add(t.val);
                    ((LinkedList<TreeNode>) queue).add(t.left);
                    ((LinkedList<TreeNode>) queue).add(t.right);


                }
                if(reverse)
                {
                    Collections.reverse(list);
                }
                reverse = !reverse;
                if(queue.size()!=0)
                {
                    ret.add(list);
                }
            }
            return ret;
    }
}
