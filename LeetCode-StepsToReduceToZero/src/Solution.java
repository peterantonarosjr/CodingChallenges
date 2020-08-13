class Solution {
	
	public static void main(String[] args) {
		
		//Testers
		int num = 14;
		int num2 = 8;
		numberOfSteps(num);
		numberOfSteps(num2);
	}
    public static int numberOfSteps(int num) {
        int steps = 0;
        while(num!=0) {
        	if(num%2==0) {
        		num/=2;
        		steps++;
        	}else {
        		num-=1;
        		steps++;
        	}
        }
        
        //System.out.println(steps);
        return steps;
    }
}