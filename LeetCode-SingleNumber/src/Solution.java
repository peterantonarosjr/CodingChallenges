class Solution {
	
	public static void main(String[] args) {
		//Testers
		int[] nums = {2,2,1};
		int[] nums2= {4,1,2,1,2};
		singleNumber(nums);
		singleNumber(nums2);
	}
    public static int singleNumber(int[] nums) {
        int single = nums[0];
        for(int i=1;i<nums.length;i++) {
            single ^= nums[i];
        }
        
        //System.out.println(single);
        return single;
    }
}