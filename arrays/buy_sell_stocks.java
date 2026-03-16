import java.util.*;
public class buy_sell_stocks {
    public static int buysellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;  //today's profit    
                MaxProfit = Math.max(MaxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buysellstocks(prices));
    }
    
}
