package nowcoder.retry;

import java.util.ArrayList;
import java.util.List;

public class BTreelist {
    static List<Integer> list = new ArrayList<>();

    //前序遍历
    public  static List<Integer> preorderTraversal(TreeNode root) {

        if(root == null)
        {
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    //中序遍历
    public  static List<Integer> INTraversal(TreeNode root) {

        if(root == null)
        {
            return null;
        }
        INTraversal(root.left);
        list.add(root.val);
        INTraversal(root.right);
        return list;
    }
    //后序遍历
    public  static List<Integer> BhTraversal(TreeNode root) {

        if(root == null)
        {
            return null;
        }

        BhTraversal(root.left);
        BhTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
