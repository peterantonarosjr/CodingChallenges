class Solution {
    public int minStartValue(int[] nums) {

        int startVal = 1;
        int currStep = startVal;
        int i = 0;

        while(true){

            currStep+=nums[i];
            if(currStep<1){
                startVal++;
                currStep=startVal;
                i=0;
            }else{

                i++;
                if(i>nums.length-1){
                    break;
                }
            }

        }

        return startVal;
    }
}
