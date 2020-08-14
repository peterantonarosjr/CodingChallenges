class Solution {
	
	public static void main(String[] args) {
	
		//Testers
		int[] nums = {1,2,3,1};
		int[] nums2 = {2,7,9,3,1};
		int[] nums3 = {1,2,2,0};
		rob(nums);
		System.out.println("*****");
		rob(nums2);
		System.out.println("*****");
		rob(nums3);
	}
	public static int rob(int[] nums) {
	       int n =  nums.length;
	       if(n==0)
	           return n;
	       if(n==1)
	           return nums[0];
	       if(n==2)
	           return Math.max(nums[0],nums[1]);
	       int[] dp = new int[n];
	       int max = Integer.MIN_VALUE;
	       dp[0] = nums[0];
	       dp[1]= Math.max(nums[0], nums[1]);
	       for(int i = 2; i<n;i++){
	           dp[i]= Math.max((dp[i-2]+nums[i]),(dp[i-1]));
	           max = Math.max(dp[i],max);
	       }
	       return max;
	        
	}
    
}