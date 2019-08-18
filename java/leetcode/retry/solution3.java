package leetcode.retry;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class solution3 {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> a= new LinkedList<>();
        int max = 0;
        int length = 0;
        char[] as = s.toCharArray();
        for (char value : as) {

            while(a.contains(value))
                a.removeFirst();
            a.add(value);
            length = a.size();
            if (max < length) {
                max = length;
            }
        }
        return max;
    }
}
