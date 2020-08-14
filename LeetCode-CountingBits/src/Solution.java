
class Solution {
	
	public static void main(String[] args) {
		
		//Testers
		int num = 2;
		int num2 = 5;
		countBits(num);
		countBits(num2);
	}
    public static int[] countBits(int num) {
        int[] bits = new int[num+1];
        bits[0]=0;
        for(int i=1; i<=num; i++) {
        	int j = i;
        	while(j>=1) {
        		int value = j%2;
        		if(value==1) {
        			bits[i]++;
        		}
        		j/=2;
        	}
        }
        /**
        for(int i=0; i<bits.length; i++) {
        	System.out.print(bits[i]);
        }
        System.out.println("");
        **/
        return bits;
        
    }
    
}