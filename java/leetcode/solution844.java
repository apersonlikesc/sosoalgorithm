import java.util.Stack;

public class solution844 {
    private Stack<Character> stackS;
    private Stack<Character> stackT;
    public solution844(){
        stackS = new Stack<>();
        stackT = new Stack<>();
    }

    public boolean backspaceCompare(String S, String T) {
        for(int i = 0;i<S.length();i++)
        {
            if(S.charAt(i)!='#')
            {
                stackS.push(S.charAt(i));
            }else{
                if(!stackS.isEmpty())
                {
                    stackS.pop();
                }
            }
        }

        for(int i = 0;i<T.length();i++)
        {
            if(T.charAt(i)!='#')
            {
                stackT.push(T.charAt(i));
            }else{
                if(!stackT.isEmpty())
                {
                    stackT.pop();
                }
            }
        }
        if(stackS.size()!=stackT.size()){
            return false;
        }
        while(!stackS.isEmpty()){
            if(stackS.pop()!=stackT.pop())
            {
                return false;
            }
        }
        return true;
    }
}
