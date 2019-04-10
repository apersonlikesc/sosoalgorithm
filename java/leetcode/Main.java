import nowcoder.*;

public class Main {
    public static void main(String[] args) {
//        nowcoder.solution19 nowcoder.solution19 = new nowcoder.solution19();
//        System.out.println(nowcoder.solution19.isValid("((())"));

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
//        nowcoder.ListNode a = new nowcoder.ListNode(1);
//        nowcoder.ListNode b = new nowcoder.ListNode(2);
//        nowcoder.ListNode c = new nowcoder.ListNode(3);
//        a.next = b;
//        b.next = c;
//        nowcoder.solution6 nowcoder.solution6 = new nowcoder.solution6();
//        nowcoder.solution6.printListFromTailToHead(a);
//        nowcoder.solution14_2 nowcoder.solution14_2 = new nowcoder.solution14_2();
//        nowcoder.solution14_2.integerBreak(9);
//        solution19 solution20 = new solution19();
//        char[] str= {'a','a','b','b','c'};
//        char[] pattern = {'a','*','b','.','c'};
//        solution20.match(str,pattern);

//        solution29 solution29 = new solution29();
//        int[][] a = {{1,2},{3,4}};
//        solution29.printMatrix(a);
//        solution31 solution31 = new solution31();
//        int[] a = {1,2,3,4,5};
//        int[] b = {4,5,3,2,1};
//        solution31.IsPopOrder(a,b);
//        solution33 solution33 = new solution33();
//        int[] a = {3,4,6,5};
//        solution33.VerifySquenceOfBST(a);
//            solution38_2 solution38 = new solution38_2();
//            solution38.Permutation("aac");
//        solution40_2 solution40_2 = new solution40_2();
//        int[] input = {2,3,4,5,1,2,1,33,4,5,1,2,1};
//        solution40_2.GetLeastNumbers_Solution(input,3);

        solution41 solution41 = new solution41();
        int[] input = {2,3,4,5,1,2,1,33,4,5,1,2,1};
        for(int num:input)
        {
            solution41.Insert(num);
        }
        solution41.GetMedian();
    }
}
