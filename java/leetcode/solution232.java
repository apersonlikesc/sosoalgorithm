import java.util.Stack;

public class solution232 {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;
    public solution232() {
        stackPop = new Stack<>();
        stackPush = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackPush.isEmpty() && stackPop.isEmpty())
        {
            throw new RuntimeException("1");
        }
        else if (stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stackPush.isEmpty() && stackPop.isEmpty())
        {
            throw new RuntimeException("2");
        }
        else if (stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stackPop.isEmpty()&&stackPush.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
