import java.util.Stack;

public class solution856 {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0;i<S.length();i++){
            int res = 0;
            char c = S.charAt(i);
            if(c=='('){
                stack.push(-1);
            }else{
                if(stack.peek()==-1){
                    stack.pop();
                    stack.push(1);
                }else{
                    while(stack.peek()!=-1){
                        res=res+stack.pop();
                    }
                    stack.pop();
                    stack.push(2*res);
                }
            }
        }
        while(!stack.isEmpty()){
            sum = sum+stack.pop();
        }
        return sum;
    }
}
