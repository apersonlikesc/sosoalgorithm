import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        solution20 solution20 = new solution20();
//        System.out.println(solution20.isValid("((())"));

//        solution155 solution155 = new solution155();
//        solution155.push(-1);

//        Stack stack = new Stack<Integer>();
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack);
//        solution739 s = new solution739();
//        int[] t = {73,74,75,71,69,72,76,73};
//        t = s.dailyTemperatures(t);

//          MyCircularQueue obj = new MyCircularQueue(3);
//         obj.enQueue(1);
//         obj.enQueue(2);
//         obj.enQueue(3);
//        boolean param_1 = obj.enQueue(4);
//
//         boolean param_2 = obj.deQueue();
//        boolean param_321 = obj.enQueue(4);
//         int param_3 = obj.Front();
//         int param_4 = obj.Rear();
//         boolean param_5 = obj.isEmpty();
//         boolean param_6 = obj.isFull();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        solution6 solution6 = new solution6();
        solution6.printListFromTailToHead(a);
    }
}
