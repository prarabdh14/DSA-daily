class Solution {
    public int maxProfit(int[] prices) 
    {  
        int p = prices.length;
        int max_pro = 0;
        int min_pri = Integer.MAX_VALUE;
        for(int i = 0 ; i < p ; i++)
        {
            if(prices[i] < min_pri)
            {
                min_pri = prices[i];
            }
            int pro = prices[i] - min_pri;
            if(pro > max_pro)
            max_pro = pro;
        }
        return max_pro;
    }
}