import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class solution739 {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[T.length];
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<Integer, Integer>();
        for(int i =0;i<T.length;i++)
        {
            result[i] = 0;
            hashMap.put(i,T[i]);
        }

        for(int i = 0;i<T.length;i++){
            if(stack.isEmpty()||T[i]<=hashMap.get(stack.peek()))
            {
                stack.push(i);
            }else{
               while(!stack.isEmpty()&&T[i]>hashMap.get(stack.peek()))
               {
                   result[stack.peek()] = i-stack.peek();
                   stack.pop();

               }
                stack.push(i);
            }
        }
        return result;
    }
}
