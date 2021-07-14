class Solution {

    public static void main(String[] args){
        int[] nums = {1,2,4,5};
        System.out.println(findPeakElement(nums));

    }

    public static int findPeakElement(int[] nums) {
        int l = 1;
        int h = nums.length-2;
        if(nums.length==1){
            return 0;
        }
        while(l<=h){
            if((nums[l]>nums[l-1] && nums[l]>nums[l+1])){
                return l;
            }
            if((nums[h]>nums[h-1] && nums[h]>nums[h+1])){
                return  h;
            }
            l++;
            h--;

        }
        if(nums[0]>nums[1]){
            return 0;
        }else{
            return nums.length-1;
        }
    }
}
