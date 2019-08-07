package nowcoder.retry;

import java.util.Stack;

public class solution9 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public void push(int node) {
        in.push(node);
    }

    public int pop() {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
            {
                out.push(in.pop());
            }
        }

        return out.pop();
    }
}
