import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution144 {
    public List<Integer> preorderTraversal(solution144_treenode root) {
        Stack<solution144_treenode> stack = new Stack<solution144_treenode>();
        solution144_treenode cur = root;
        List<Integer> list = new ArrayList<>();
        while(cur!=null||!stack.isEmpty()){
            if(cur!=null)
            {
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                cur = cur.right;
            }
        }
        return list;
    }
}
