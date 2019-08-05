package nowcoder;

public class solution56 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int dif = 0;
        for(int num : array)
        {
            dif ^= num;
        }
        dif &= -dif;
        for(int num:array)
        {
            if((num&dif) == 0)//这就相当于将他们分类了
            {
                num1[0] ^= num;//异或保证进入的两个相同的数为0
            }else{
                num2[0] ^= num;
            }
        }
    }
}
