package leetcode.retry;

import java.util.List;
import java.util.Stack;

public class solution2 {
    //给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    //
    //如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    //
    //您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Head = new ListNode(-1);
        ListNode pre = Head;
        boolean add1 = false;
        while(l1!=null||l2!=null)
        {
            int l1val,l2val;
            if(l1 == null)
            {
                l1val =0;
            }else{
                l1val = l1.val;
            }
            if (l2 == null)
            {
                l2val = 0;
            }else{
                l2val = l2.val;
            }
            int val = 0;
            if(add1)
            {
                val++;
                add1 = false;
            }
            if(val + l1val+ l2val > 9)
            {
                add1 = true;
            }
            val = (val+l1val+l2val)%10;
            ListNode node = new ListNode(val);
            pre.next = node;
            pre = node;
            if(l1!=null)
            {
                l1 = l1.next;
            }
            if(l2!=null)
            {
                l2 = l2.next;
            }
        }
        if(add1)
        {
            pre.next = new ListNode(1);
        }
        return Head.next;
    }
}
