class Solution {
    public int lengthOfLongestSubstring(String s) {


        HashSet<Character> subs = new HashSet<>();
        int start = 0, end = 0, max = 0;

        while(end < s.length() && start < s.length()){

            if(!subs.contains(s.charAt(end))){

                subs.add(s.charAt(end));
                max = Math.max(max,end-start+1);
                end++;
            }
            else{

                subs.remove(s.charAt(start));
                start++;
            }
        }

        return max;
    }

}
