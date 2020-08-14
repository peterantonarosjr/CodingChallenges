import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		//Testers
		int[] nums = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<Integer>();
        int[] test = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
        	test[nums[i]]++;
        }
        for(int j=1; j<test.length; j++) {
        	if(test[j]==0) {
        		missing.add(j);
        	}
        }
        //System.out.println(missing);
        return missing;
    }
}