class Solution {
	public static void main(String[] args) {
		//Testers
		int[] nums = {7,1,5,3,6,4};
		int[] nums2 = {1,2,3,4,5};
		int[] nums3 = {7,6,4,3,1};
		maxProfit(nums);
		maxProfit(nums2);
		maxProfit(nums3);
		
	}
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0) {
        	return profit;
        }
        for(int i=0; i<prices.length-1; i++) {
        	if(prices[i]<prices[i+1]) {
        		profit += prices[i+1]-prices[i];
        	}
        }
        System.out.println(profit);
        return profit;
    }
}