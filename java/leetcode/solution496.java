import java.util.HashMap;
import java.util.Stack;

public class solution496 {
    private Stack<Integer> stack;
    private HashMap<Integer,Integer> hashMap;
    private int[] result;
    public solution496(){
        stack = new Stack<>();
        hashMap = new HashMap<>();
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        result = new int[nums1.length];
        for(int num:nums2)
        {
            while(!stack.isEmpty() && stack.peek()<num){
                hashMap.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++)
        {
            result[i] = hashMap.getOrDefault(nums1[i],-1);
        }

        return result;
    }
}
