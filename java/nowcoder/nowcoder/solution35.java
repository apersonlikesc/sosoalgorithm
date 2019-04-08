package nowcoder;

public class solution35 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
        {
            return null;
        }
        RandomListNode cur = pHead;
        while(cur!=null)
        {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next= cur.next;
            cur.next = clone;
            cur = clone.next;//指向下一个cur
        }
        cur = pHead;
        while(cur != null)
        {
            RandomListNode clone = cur.next;
            if(cur.random!=null)
            {
                clone.random = cur.random.next;//curde random结点的next就是clone的random
            }
            cur = clone.next;
        }
        cur = pHead;
        RandomListNode cloneHead = pHead.next;
        while(cur.next!=null)
        {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return cloneHead;
    }
}
