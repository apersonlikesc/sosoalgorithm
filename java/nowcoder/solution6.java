package nowcoder;

import java.util.ArrayList;

public class solution6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode!=null)
        {
            ret= printListFromTailToHead(listNode.next);
            ret.add(listNode.val);
        }
        return ret;
    }
}
