package ArraysTutorials;

public class BuyAndSellStocks {
	public static void main(String args[]) {
		int arr[]= {7,1,5,3,6,4};
		buysellstock(arr);
	}
	public static void buysellstock(int prices[]) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i<prices.length; i++) {
			if(buyPrice < prices[i]) {
				int profit = prices[i] - buyPrice;
				maxProfit=Math.max(maxProfit, profit);
			}else {
				buyPrice = prices[i];
			}
		}
		System.out.println("max profit is = "+ maxProfit);
	}

}
