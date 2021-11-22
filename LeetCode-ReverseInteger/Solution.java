class Solution {
    public int reverse(int x) {

        if(x>-10 && x<10){
            return x;
        }

        int reverse = 0;
        int prev = 0;

        while(x!=0){

            int pop = x%10;

            reverse=(reverse*10)+pop;

            if((reverse-pop)/10!=prev){
                return 0;
            }
            prev = reverse;
            x/=10;
        }

        return reverse;
    }
}
