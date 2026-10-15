class Solution {
    public int maxProfit(int[] prices) {
        int pro =0;
        int min = 10001;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]-min>pro){
                pro=prices[i]-min;
            }
        }
        return pro;
    }
}