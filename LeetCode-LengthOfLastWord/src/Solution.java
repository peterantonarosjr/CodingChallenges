class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1,j;
        while(i>=0&&s.charAt(i)==' ')
            i--;
        j=i;
        while(i>=0&&s.charAt(i)!=' ')
            i--;
        return j-i;
    }
}
