package leetcode.retry;

import java.util.List;

public class solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        {
            return l2;
        }
        if(l2 == null)
        {
          return l1;
        }
        ListNode Head = l1.val<=l2.val?l1:l2;
        ListNode a1 = l1;
        ListNode a2 = l2;
        while(l2!=null && l1!=null)
        {
            if(l1.next!=null||l2.next!=null)
            {
                if(l1.next!=null){
                    if(l1.next.val<=l2.val)
                    {
                        l1 = l1.next;
                        a1 = l1;
                        continue;
                    }
                }
                if(l2.next!=null)
                {
                    if(l2.next.val<l1.val)
                    {
                        l2 = l2.next;
                        a2 = l2;
                        continue;
                    }
                }
            }
            if(l1.val<=l2.val)
            {
                l1 = l1.next;
                a1.next = l2;
                a1 = l1;
            }else{
                l2 = l2.next;
                a2.next = l1;
                a2 = l2;
            }
        }
        return Head;
    }
}
