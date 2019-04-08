package nowcoder;

import java.util.Stack;

public class solution31 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i : pushA)
        {
            stack.push(i);
            while(index<pushA.length&&popA[index]==stack.peek())
            {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
