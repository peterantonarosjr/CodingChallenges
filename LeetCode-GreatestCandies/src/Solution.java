import java.util.ArrayList;
import java.util.List;

class Solution {
	
	public static void main(String[] args) {
		
		//Testers
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		int[] candies2 = {4,2,1,1,2}; 
		int extraCandies2 = 1;
		kidsWithCandies(candies,extraCandies);
		kidsWithCandies(candies2,extraCandies2);
	}
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max=candies[0];
    	for(int i=1; i<candies.length; i++) {
    		if(candies[i]>max) {
    			max = candies[i];
    		}
    	}
    	for(int i=0; i<candies.length; i++) {
    		
    		if(candies[i]+extraCandies>= max) {
    			list.add(true);
    		}else {
    			list.add(false);
    		}
    	}
    	/**
    	System.out.println(max);
    	for(int z=0; z<list.size(); z++) {
    		System.out.println(list.get(z));
    	}
    	**/
    	return list;
    }
}