class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length-1;
        int low = 0;
        int high = n;


        while(true){

            if(high<low){
                return -1;
            }
            int midPoint = low+(high-low)/2;

            if(nums[midPoint]<target){
                low=midPoint+1;

            }else if(nums[midPoint]>target){
                high = midPoint-1;

            }else{
                return midPoint;
            }

        }

    }
}

