class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        
        
        currSum = 0
        
        maxSum = nums[0]
        
        for num in nums:
            
            currSum+=num
            
            if currSum > maxSum:
                
                maxSum=currSum
                
            
            if currSum<0:
                currSum = 0
                
                
        return maxSum
