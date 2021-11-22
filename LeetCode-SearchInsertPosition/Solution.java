class Solution {
    public int searchInsert(int[] nums, int target) {
        //O(log n) -> Binary Insert

        int low = 0;
        int high = nums.length-1;
        while(high>=low){

            int mid = low+(high-low)/2;

            if(nums[mid]>target){

                high = mid-1;

            }else if(nums[mid]<target){

                low = mid+1;

            }else if(nums[mid]==target){
                return mid;

            }
        }

        return low;
    }
}
