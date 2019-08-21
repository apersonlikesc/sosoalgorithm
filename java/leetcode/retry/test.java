package leetcode.retry;

public class test {
    public static void main(String[] args) {
        solution206 a = new solution206();
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;

        a.reverseList(a1);
    }
}
