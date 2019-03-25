import java.util.Stack;

public class solution946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pop = 0;
        for(int i = 0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty()&&pop<popped.length&&popped[pop] == stack.peek()){
                stack.pop();
                pop++;
            }
        }
        return stack.isEmpty();
    }
}
