public class BestTimeToSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,10,3,6,4};
        System.out.println(MaxProfit(prices));
    }
    public static int MaxProfit(int prices[]){
        int buyPrice = prices[0];
        int profit = 0,max = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i]>buyPrice){
                profit = prices[i] - buyPrice;
                max = Math.max(profit,max);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return max;
    }
}
