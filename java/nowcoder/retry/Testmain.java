package nowcoder.retry;

public class Testmain {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(7);
        a1.left = null;
        a1.right = a3;
        a3.left = a2;
        a3.right = a5;
        System.out.println(BTreelist.BhTraversal(a1));
    }
}
