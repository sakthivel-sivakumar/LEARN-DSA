class Solution:
    def twoSum(self, nums: list[int], t: int) -> list[int]:
        n = len(nums)
        for i in range(0,n):
            for j in range(i+1,n):
                if nums[i] + nums[j] == t:
                    return [i,j]
                
        return [-1,-1]
