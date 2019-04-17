import java.util.ArrayList;
import java.util.List;

public class solution763 {
    public List<Integer> partitionLabels(String S) {
        int[] lastIndexOfChar = new int[26];
        for(int i = 0;i<S.length();i++)
        {
            lastIndexOfChar[char2Index(S.charAt(i))] = i;//记录最后一次出现的位置
        }

        List<Integer> partitions = new ArrayList<>();
        int firstIndex=  0;
        while(firstIndex < S.length())
        {
            int lastIndex = firstIndex;
            for(int i = firstIndex;i<S.length()&&i<=lastIndex;i++)
            {
                int index = lastIndexOfChar[char2Index(S.charAt(i))];//找到最后出现的位置
                if(index > lastIndex)
                {
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex- firstIndex +1);//假如在第一个和最后一个中 里面每一个字母最后出现的位置都在里面 这个就是结果
            firstIndex = lastIndex + 1;
        }
        return  partitions;
    }

    private int char2Index(char c) {
        return c-'a';
    }
}
