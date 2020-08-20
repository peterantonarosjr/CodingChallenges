import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		//Testers
		int n=3,k=7;
		numsSameConsecDiff(n,k);
	}
	
	static List<Integer> nums = new ArrayList<Integer>();
    public static int[] numsSameConsecDiff(int N, int K) {
    	builder(N,K,0);
    	int[] arr = new int[nums.size()];
    	//Fill arr with nums values
    	for(int z=0; z<arr.length; z++) {
    		arr[z]=nums.get(z);
    		
    	}
    	//Print
    	for(int i = 0; i<arr.length; i++) {
    		System.out.println(arr[i]);
    	}
    	return arr;
    }
    
    public static void builder(int n, int k, int current) {
    	if(n==0) {
    		nums.add(current);
    		return;	
    	}
    	
    	for(int i = 0; i<10; i++) {
    		
    		if(current==0 && i==0 && n!=1) {
    			continue;
    		}
    		int prev = current%10;
    		//System.out.println(current);
    		if(current==0) {
    			builder(n-1,k,i);
    		}else if(Math.abs(prev-i)==k) {
    			builder(n-1,k,current*10+i);
    		}
    		
    	}
    	
    }
    
}