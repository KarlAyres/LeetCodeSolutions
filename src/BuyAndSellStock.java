/**You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
 to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] pricesArray = {2,4,1};
        System.out.println(buyAndSellStock(pricesArray));
    }
    public static int buyAndSellStock(int[] pricesArray) {

        // Initialise variable for max profit and purchase day
        int maxProfit = 0;
        int purchaseDay = 0;

        // Iterate over pricesArray, store maximum value's purchase day
        for (int i = 0; i < pricesArray.length; i++) {
            if (pricesArray[purchaseDay] > pricesArray[i]) {
                purchaseDay = i;
            }
            // Calculate max profit as the maximum of either the current, or the difference
                maxProfit = Math.max(maxProfit, pricesArray[i] - pricesArray[purchaseDay]);
        }

        return maxProfit;
    }
}
