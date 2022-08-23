class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        maxNum = max(nums)+1
        
        occurences = [0] * maxNum
        
        for i in nums:
            occurences[i]+=1
            
        return occurences.index(max(occurences))
