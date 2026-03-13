class Solution(object):
    def mergeAdjacent(self, nums):
        stack = []
        for num in nums:
            while stack and stack[-1] == num:
                num += stack.pop()
            stack.append(num)

        return stack
        