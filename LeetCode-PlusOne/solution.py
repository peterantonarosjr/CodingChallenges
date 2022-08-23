class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        length = len(digits)
        
        number = 0
        
        for i in range(length):
            mult = 10**(length-1-i)
            curr = digits[i]*mult
            
            number+=curr
        
        number+=1
        
        res = [int(x) for x in str(number)]
        
        return res
