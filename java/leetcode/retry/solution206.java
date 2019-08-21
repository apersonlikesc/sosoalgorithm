package leetcode.retry;

public class solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        if(head==null)
        {
            return null;
        }
        while(node.next!=null)
        {
            node = node.next;
        }
        if (head.next!=null)
        {
            reverseList(head.next);
            head.next.next = head;
            head.next=null;
        }
        return node;
    }
}
