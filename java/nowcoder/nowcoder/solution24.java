package nowcoder;

public class solution24 {
    public ListNode ReverseList(ListNode head)
    {
        if(head == null||head.next == null)
        {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
}
