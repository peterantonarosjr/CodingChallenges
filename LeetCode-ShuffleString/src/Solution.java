import java.util.HashMap;
import java.util.Map;

class Solution {
	
	public static void main(String[] args) {
		
		//Testers
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		String s2 = "aiohn";
		int[] indices2 = {3,1,4,2,0};
		restoreString(s,indices);
		restoreString(s2,indices2);
	}
    public static String restoreString(String s, int[] indices) {
        String proper = "";
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i=0; i<s.length(); i++) {
        	map.put(indices[i], s.charAt(i));
        }
        for(int j=0; j<map.size(); j++) {
        	proper+=map.get(j);
        }
        //System.out.print(proper);
        return proper;
    }
}