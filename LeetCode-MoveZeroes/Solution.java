class Solution {
    public void moveZeroes(int[] nums) {

        if(nums.length==1){
            return;
        }
        int index1 = 0;
        int index2 = 1;
        int len = nums.length;

        while(index2<len){
            //If zero swap
            if(nums[index1]==0 && nums[index2]!=0){

                int temp = nums[index1];
                nums[index1]=nums[index2];
                nums[index2]=temp;

            }
            if(nums[index1]!=0){
                index1++;
            }
            index2++;
        }


    }
}
