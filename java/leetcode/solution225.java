import java.util.Deque;
import java.util.LinkedList;

public class solution225 {
    Deque<Integer> deque;
    public solution225() {
        deque = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        deque.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque.pop();
    }

    /** Get the top element. */
    public int top() {
        return deque.getFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque.size()>0?false:true;
    }
}
