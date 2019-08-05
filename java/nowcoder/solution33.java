package nowcoder;

public class solution33 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0)
        {
            return false;
        }
        return verify(sequence,0,sequence.length-1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if(last-first<=1) //为什么呢?举个例子 没有右子树,最大的就是root 前面的都比root小,所以curindex会指向root,由于考虑到正常情况,curindex是
//            第一个比root的数,所以last-1会比curindex大,但是由于没有右子树,last和curindex为同一个位置所以需要这样判断(<0的情况)
            //等于1的情况就是只有一个子结点的时候
            //等于0的情况就是子结点没有子结点的时候
        {
            return true;
        }
        int rootval = sequence[last];
        int curindex = first;
        while(curindex<last&&sequence[curindex]<=rootval)
        {
            curindex++;
        }
        for(int i = curindex;i<last;i++)
        {
            if(sequence[i]<rootval)
            {
                return false;
            }
        }
        return verify(sequence,first,curindex-1)&&verify(sequence,curindex,last-1);
    }
}
