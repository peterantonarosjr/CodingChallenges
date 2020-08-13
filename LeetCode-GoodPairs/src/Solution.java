class Solution {
	
	
	public static void main (String[] args) {
		//      Index 0,1,2,3,4,5
		//Testers
		int[] nums = {1,2,3,1,1,3};
		int[] nums2 = {1,1,1,1};
		int[] nums3 = {1,2,3};
		numIdenticalPairs(nums);
		numIdenticalPairs(nums2);
		numIdenticalPairs(nums3);

	}
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
    	for(int i=0; i<nums.length; i++) {
    		
    		for(int j=0; j<nums.length; j++) {
    			
    			if((nums[i]==nums[j]) && i<j ) {
    				pairs++;
    			}
    		}
    	}
                
        //System.out.println(pairs);
    	return pairs;
    }

}