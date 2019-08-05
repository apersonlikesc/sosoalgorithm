package nowcoder;

public class solution17 {
    public void print1toMaxofdigit(int n)
    {
        if(n < 0)
        {
            return;
        }
        char[] number = new char[n];
        print1toMaxofdigit(number,0);
    }

    private void print1toMaxofdigit(char[] number, int digit) {
        if(digit == number.length)
        {
            printNumber(number);
            return;
        }
        for(int i = 0;i<10;i++)
        {
            number[digit] = (char) (i+'0');
            print1toMaxofdigit(number,digit+1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while(index<number.length&& number[index] =='0')
        {
            index++;
        }
        while(index<number.length)
        {
            System.out.println(number[index++]);
        }
        System.out.println();
    }
}
