 
class Solution {
    public int[] sortedSquares(int[] nums) {

        int low = 0;
        int high = nums.length-1;
        int[] nums2 = new int[nums.length];
        int len = nums.length-1;

        while(len>=0){


            if(Math.abs(nums[low])>Math.abs(nums[high])){

                nums2[len]=nums[low]*nums[low];
                low++;

            }else{

                nums2[len]=nums[high]*nums[high];
                high--;
            }

            len--;
        }

        return nums2;
    }

}
