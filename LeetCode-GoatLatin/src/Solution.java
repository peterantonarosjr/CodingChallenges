

class Solution {
	
	public static void main(String[] args) {
		//Testers
		String word1 = "I speak Goat Latin";
		String word2 = "The quick brown fox jumped over the lazy dog";
		toGoatLatin(word1);
		toGoatLatin(word2);
	}
    public static String toGoatLatin(String S) {
    	String[] words = S.split(" ");
        String build = "";
        String as = "a";
        
        for(int i=0; i<words.length; i++) {
        	String current = words[i];
        	if(current.charAt(0)=='a') {
        		current+="ma"+as.repeat(i+1)+" ";
        		build+=current;
        	}else {
        		char first = current.charAt(0);
        		build+=current.substring(1,current.length())+first+"ma"+as.repeat(i+1)+" ";
        		
        	}
        	
        }
        System.out.println(build);
        return build;
    	
    }
}