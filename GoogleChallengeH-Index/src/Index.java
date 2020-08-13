/**
Inputs are in the form as specified in the problem
Input 1: Total Samples
Input 2: Total Papers
Input 3: Citations per paper (space between citations)
**/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Index {
	static int tc;
	static int np;
	static int result;
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			tc = Integer.parseInt(br.readLine());
			for(int i=1; i<=tc; i++) {
				np = Integer.parseInt(br.readLine());
				String[] temp = br.readLine().split(" ");
				int[] pc = new int[np];
				for(int j=0; j<temp.length; j++) {
					pc[j] = Integer.parseInt(temp[j]);
				}
				result = Hdex(sort(pc));
				System.out.println("Case #"+i+" "+result);
			}
		
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
			
	}
	
	//Insertion Sort Algorithm
	public static int[] sort(int[] citations) {
		int n= citations.length;
		for(int i=1; i<n; i++) {
			int k = citations[i];
			int j = i-1;
			while(j>=0 && citations[j]>k) {
				citations[j+1] = citations[j];
				j = j-1;
			}
			citations[j+1] = k;
		}
		return citations;
	}
	
	//H-Index Solving Function
	public static int Hdex(int[] citations) {
		if(citations == null || citations.length ==0) {
			return 0;
		}
		for(int h= citations.length; h>0; h--) {
			int x = citations.length-h;
			if(citations[x]>=h) {
				return h;
			}
		}
		
		return 0;
	}

}
