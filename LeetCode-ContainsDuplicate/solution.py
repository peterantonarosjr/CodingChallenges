class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        setNums = set(nums)
        
        return len(setNums) != len(nums)
        
