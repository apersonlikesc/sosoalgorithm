package nowcoder;

import java.util.ArrayList;

public class solution6_2 {
    ////头插法
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = new ListNode(-1);
        while(listNode != null)
        {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }

        ArrayList<Integer> ret  = new ArrayList<>();
        head = head.next;
        while(head!= null)
        {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
}
