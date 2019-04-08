import nowcoder.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution94 {
    public List<Integer> inorderTraversal(solution144_treenode root) {
        List<Integer> list = new ArrayList<>();
        Stack<solution144_treenode> stack = new Stack<>();
        solution144_treenode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
