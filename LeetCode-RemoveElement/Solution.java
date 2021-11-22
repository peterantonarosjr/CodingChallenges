class Solution {
    public int removeElement(int[] nums, int val) {

        int place = 0;

        for(int j=0; j<nums.length;j++){

            if(nums[j]!=val){
                nums[place]=nums[j];
                place++;
            }
        }

        return place;

    }
}
