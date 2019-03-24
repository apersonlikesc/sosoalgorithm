import java.util.Stack;

public class solution921 {
    Stack<Character> stack;
    public solution921(){
        stack = new Stack<Character>();
    }
    public int minAddToMakeValid(String S) {
        for(int i=0;i<S.length();i++){
            char a = S.charAt(i);
            if(!stack.isEmpty() && a == ')'&&stack.peek()=='('){
                stack.pop();
            }else{
                stack.push(a);
            }
        }
        return stack.size();
    }
}
