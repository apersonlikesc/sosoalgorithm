package nowcoder.retry;

import java.util.ArrayList;

public class solution6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode==null)
        {
            return ret;
        }
        if(listNode.next == null)
        {
            ret.add(listNode.val);
        }else{
            ret = printListFromTailToHead(listNode.next);
            ret.add(listNode.val);
        }
        return ret;
    }

    }
