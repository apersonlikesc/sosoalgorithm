package leetcode.retry;

public class Util {
    public static TreeNode GenerateTree(Integer[] a,int index)
    {
        if(index>a.length-1)
        {
            return null;
        }
        if(a[index] == null)
        {
            return null;
        }
        TreeNode Head = new TreeNode(a[index]);
        Head.left = GenerateTree(a,2*index+1);
        Head.right = GenerateTree(a,2*index+2);
        return Head;
    }
    public static TreeNode GenerateTree(Integer[] a)
    {
        return GenerateTree(a,0);
    }

}
