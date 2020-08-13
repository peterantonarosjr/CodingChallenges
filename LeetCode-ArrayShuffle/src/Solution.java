
class Solution {
	
	
	public static void main(String[] args) {
		
		int[] array = {2,5,1,3,4,7};
		shuffle(array,6);
	}
	
	
    public static int[] shuffle(int[] nums, int n) {
    	int half = nums.length/2;
    	int a = 0;
    	int pos = 0;
    	int[] result = new int[nums.length];
    	while(half<nums.length){
    		
    		result[pos]=nums[a];
    		pos++;
    		a++;
    		result[pos]=nums[half];
    		pos++;
    		half++;
    	}
    	
    	for(int i=0; i<result.length; i++) {
    		System.out.print(result[i]);
    	}
    	return result;
    }
}