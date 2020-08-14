class Solution {
	
	public static void main(String[] args) {
		//Testers
		int steps = 2;
		int steps2 = 3;
		int steps3 = 4;
		climbStairs(steps);
		climbStairs(steps2);
		climbStairs(steps3);
	}
    public static int climbStairs(int n) {
        int[] stairs = new int[n+1];
        stairs[0]=1;
        stairs[1]=1;
        for(int i=2;i<=n;i++) {
        	stairs[i]=stairs[i-1]+stairs[i-2];
        	
        }
        
        //System.out.println(stairs[n]);
        return stairs[n];
    }

}



