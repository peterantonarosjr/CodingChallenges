class Solution {
	
	public static void main(String[] args) {
		//Testers
		int num = 6;
		int num2 = 10;
		int num3 = 28;
		int num4 = 496;
		int num5 = 8128;
		
		System.out.println(checkPerfectNumber(num));
		System.out.println(checkPerfectNumber(num2));
		System.out.println(checkPerfectNumber(num3));
		System.out.println(checkPerfectNumber(num4));
		System.out.println(checkPerfectNumber(num5));

	}
	
    public static boolean checkPerfectNumber(int num) {
        if(num==1) {
        	return false;
        }
    	int sum = 1;
    	for(int i=2; i*i<num; i++) {
    		//System.out.print(i);
    		
    		if(num%i==0) {
    			sum+=num/i;
    			if(num/i!=i) {
    				sum+=i;
    			}
    		}
    	}
    	
    	return sum==num;
    }
}
