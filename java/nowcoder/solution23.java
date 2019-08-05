package nowcoder;

public class solution23 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)
        {
            return null;
        }
        ListNode slow = pHead,fast = pHead;
        do{
            fast  = fast.next.next;
            slow = slow.next;
        }while(slow!=fast);
        fast = pHead;
        while(slow!=fast)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
