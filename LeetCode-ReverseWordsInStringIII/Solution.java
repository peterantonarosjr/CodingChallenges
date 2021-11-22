class Solution {
    public String reverseWords(String s) {

        char[] sC = s.toCharArray();

        int low = 0;
        int high = sC.length-1;

        while(low<high){

            char temp = sC[high];
            sC[high]=sC[low];
            sC[low]=temp;

            low++;
            high--;
        }


        String[] splitArr = String.valueOf(sC).split("\\s+");

        int start = 0;
        int end = splitArr.length-1;


        while(start<end){

            String temp = splitArr[end];
            splitArr[end] = splitArr[start];
            splitArr[start] = temp;

            start++;
            end--;

        }

        String str = String.join(" ", splitArr);
        return str;

    }
}
