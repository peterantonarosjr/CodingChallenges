
class Solution {
	
	public static void main(String[] args) {
		//Testers
		int[] nums = {3,3,5,0,0,3,1,4};
		int[] nums2 = {1,2,3,4,5};
		int[] nums3 = {7,6,4,3,1};
		maxProfit(nums);
		maxProfit(nums2);
		maxProfit(nums3);
	}
    public static int maxProfit(int[] prices) {
        if(prices.length==0) {
        	return 0;
        }
        int b1 = -prices[0];
        int s1 = 0;
        int b2 = -prices[0];
        int s2 = 0;
        for(int i = 1; i < prices.length; i++) {
            b1 = Math.max(b1, -prices[i]);
            s1 = Math.max(s1, b1 + prices[i]);
            b2 = Math.max(b2, s1 - prices[i]);
            s2 = Math.max(s2, b2 + prices[i]);
        }
        System.out.println(s2);
        return s2;
    }
}