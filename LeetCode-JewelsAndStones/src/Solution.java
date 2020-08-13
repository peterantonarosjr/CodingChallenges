class Solution {
	
	public static void main(String[] args) {
		
		//Testers
		String J = "aA"; 
		String S = "aAAbbbb";
		numJewelsInStones(J,S);
		String J2 = "z"; 
		String S2 = "ZZ";
		numJewelsInStones(J2,S2);
	}
	
	
    public static int numJewelsInStones(String J, String S) {
    	int tj = 0;
    	int[] chars = new int[58];
    	
    	for(int i=0; i<J.length(); i++) {
    		chars[J.charAt(i)-65] =1;
    	}
    	
    	for(int j=0; j<S.length(); j++) {
    		tj += chars[S.charAt(j)-65];
    	}
    	//System.out.println(tj);
    	return tj;
    }
}