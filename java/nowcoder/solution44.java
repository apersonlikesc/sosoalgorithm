package nowcoder;

public class solution44 {
    public int getDigitAtIndex(int index){
        if(index<0)
        {
            return -1;
        }
        int place = 1;//位数
        while(true)
        {
            int amout = getAmountOfPlace(place); //place 位数的数字的个数
            int totalAmount = amout*place;//字符串的长度
            if(index < totalAmount)
            {
                return getDigitAtIndex(index,place);
            }
            index -= totalAmount;
            place++;
        }

    }

    private int getDigitAtIndex(int index, int place) {
        int beginNumber = getBeignNumberofPlace(place);//开始的数字
        int shiftNumber = index/place;//相对于开始的数字的  数的位置
        String number = (beginNumber+shiftNumber)+"";
        int count = index % place;//偏移量(相对于本身的第一个字符)
        return number.charAt(count) -'0';
    }

    private int getBeignNumberofPlace(int place) {
        if(place == 1)
        {
            return 0;
        }
        return  (int) Math.pow(10,place-1);
    }

    private int getAmountOfPlace(int place) {
        if(place == 1)
        {
            return 10;
        }
        return (int)Math.pow(10,place-1) *9;
    }
}
