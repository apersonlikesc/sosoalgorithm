package nowcoder.retry;

import java.util.ArrayList;
import java.util.List;

public class solution6_2 {
    //链接新的节点的时候还是通过new来构建一个新的节点吧
    //像这样ListNode node = new ListNode(listNode.val); 直接赋值list的话会晕-.-
    public ArrayList<Integer> printListFromTailHToHead(ListNode listNode)
    {
     ListNode head = new ListNode(-1);

     while(listNode!=null)
     {
         ListNode node = new ListNode(listNode.val);
         if(head.next!=null)
         {
             node.next = head.next;
         }
         head.next = node;
         listNode = listNode.next;
     }
     ArrayList<Integer> ret = new ArrayList<>();
     head = head.next;
     while(head!=null)
     {
         ret.add(head.val);
         head = head.next;
     }
     return ret;
    }
}
