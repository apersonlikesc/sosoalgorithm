package nowcoder;

import java.util.ArrayList;
import java.util.Stack;

public class solution6_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null)
        {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while(!stack.isEmpty())
        {
            ret.add(stack.pop());
        }
        return ret;
    }
}
