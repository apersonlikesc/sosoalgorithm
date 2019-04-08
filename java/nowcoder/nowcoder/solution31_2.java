package nowcoder;

import java.util.Stack;

public class solution31_2 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int n = pushA.length;
        Stack<Integer> stack = new Stack<>();
        for(int pushindex = 0,popindex = 0;pushindex<n;pushindex++)
        {
            stack.push(pushA[pushindex]);
            while(popindex<n&&!stack.isEmpty()&&stack.peek()==popA[popindex])
            {
                popindex++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
