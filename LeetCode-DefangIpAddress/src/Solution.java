class Solution {
	
	public static void main(String[] args) {
		//Testers
		String address = "1.1.1.1";
		String address2 = "255.100.50.0";
		
		defangIPaddr(address);
		defangIPaddr(address2);
	}
	
	
    public static String defangIPaddr(String address) {
    	String replace = address.replace(".", "[.]");
    	//System.out.println(replace);
    	return replace;
    	
    }
}