class Solution {
    public int maxProfit(int[] prices) {
        int Max=0,x=prices.length-1;  //to be min   

        int maxProfit = 0;
        for(int buyday = 0 ; buyday < prices.length ; buyday++)
            {
                if(Max<=buyday){
                   Max=buyday;
                for(int sellday = buyday; sellday < prices.length; sellday++)
                {
                    
                    int profit = prices[sellday]-prices[buyday];
                    if(profit>=maxProfit){
                        maxProfit=profit;
                        Max=sellday;
                    }
                    else if(prices[Max]==prices[sellday]&&Max<sellday){
                        Max=sellday;
                    }
                    
                }
               
            }
            else{
                maxProfit = Math.max(prices[Max]-prices[buyday],maxProfit);
            }
            }
         return maxProfit;
    }
}