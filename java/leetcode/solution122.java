public class solution122 {
    public int maxProfit(int[] prices) {
        int price = 0;
        if(prices.length<2)
        {
            return price;
        }
        for(int i = 0;i<prices.length-1;i++)
        {
            if(prices[i] < prices[i+1])
            {
                price = price+ prices[i+1] - prices[i];
            }
        }
        return price;
    }
}
