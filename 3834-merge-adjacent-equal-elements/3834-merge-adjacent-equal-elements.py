class Solution(object):
    def mergeAdjacent(self, nums):
        stack = []
        
        for i in nums:
            val = i
            
            while stack and stack[-1] == val:
                val = stack.pop() + val
            
            stack.append(val)
        
        return stack