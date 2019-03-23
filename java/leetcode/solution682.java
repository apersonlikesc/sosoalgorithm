import java.util.Stack;

public class solution682 {
    private Stack<Integer> stack;

    public solution682(){
        stack = new Stack<>();
    }

    public int calPoints(String[] ops) {
        for(String op:ops)
        {
            if(op.equals("+"))
            {
                int value = stack.pop();
                int value2 = stack.peek();
                stack.push(value);
                stack.push(value+value2);
            }else if (op.equals("C"))
            {
                stack.pop();
            }else if(op.equals("D"))
            {
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for(int a:stack)
        {
            ans = ans+a;
        }
        return ans;
    }
}
