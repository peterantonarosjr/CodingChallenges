class Solution {
    public boolean isPalindrome(int x) {

        //Base case check if X < 10 && x > 0 -> 1-9 are always palindromes

        if(x>=0 && x<10){
            return true;
        }else if(x<0 || x%10==0){ //x%10==0 implies last digit = 0 and the first one !=0-> false
            return false;
        }

        int reverse = 0;
        while(x>reverse){

            int pop = x%10; //Gets last digit from x
            x/=10; //Remove last digit from x
            reverse = (reverse*10)+pop; //Appends pop to reverse
        }
        if(x==reverse || x==reverse/10){ //Special case of odd number x=121->1, reverse=12/10->1
            return true;
        }else{
            return false;
        }


    }
}
