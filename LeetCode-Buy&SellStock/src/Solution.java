class Solution {
	
	public static void main(String[] args) {
		//Testers
		int[] nums = {7,1,5,3,6,4};
		int[] nums2 = {7,6,4,3,1};
		int[] nums3 = {0,0,0,0,0,0,0,0};
		int[] nums4 = {7,2,3,1};
		int[] nums5 = {3,2,6,5,0,3};
		maxProfit(nums);
		maxProfit(nums2);
		maxProfit(nums3);
		maxProfit(nums4);
		maxProfit(nums5);
	}
	
    public static int maxProfit(int[] prices) {
    	int profit = 0;
    	if(prices.length==0) {
    		return profit;
    	}
    	int min = prices[0];
    	for(int i=1; i<prices.length; i++) {
    		min = Math.min(min, prices[i]);
    		int curr = Math.abs(min-prices[i]);
    		if(curr>profit) {
    			profit=curr;
    		}
    	}
    	System.out.println(profit);
    	return profit;
    }
}