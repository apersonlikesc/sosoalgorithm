package nowcoder.retry;

import java.util.ArrayList;
import java.util.Stack;

public class solution6_3 {
    //倒叙可以优先考虑栈
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        ArrayList<Integer> ret = new ArrayList<>();
        while(listNode!=null)
        {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while(!stack.isEmpty())
        {
            ret.add(stack.pop().val);
        }
        return ret;
    }
}
