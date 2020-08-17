class Solution {
	
	public static void main(String[] args) {
		//Testers
		int[] nums = {1,8,6,2,5,4,8,3,7};
		int[] nums2 = {2,1,1,1,1,9};
		maxArea(nums);
		maxArea(nums2);
	}
    public static int maxArea(int[] height) {
    	int area = 0;
    	if(height.length<2) {
    		return area;
    	}
    	int first = 0;
    	int second = height.length-1;
    	
    	while(first<second) {
    		area = Math.max(area, Math.min(height[first], height[second])*(second-first));
    		if(height[first]>height[second]) {
    			second--;
    		}else {
    			first++;
    		}
    	}
    	
    	System.out.println(area);
    	return area;
    }
}