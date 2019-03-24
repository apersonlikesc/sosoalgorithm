import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution173 {
    Stack<solution96_treenode> stack;
    solution96_treenode t;
    public solution173(solution96_treenode root){
        stack = new Stack<>();
        t =root;
        while(t!=null)
        {
            stack.push(t);
            t = t.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        solution96_treenode node = stack.pop();
        int val = node.val;
        node = node.right;
        while(node!=null)
        {
            stack.push(node);
            node = node.left;
        }
        return val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }
    }
