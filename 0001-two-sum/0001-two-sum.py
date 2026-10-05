class Solution:
    def twoSum(self, nums: list[int], t: int) -> list[int]:
        n = len(nums)
        for i in range(0,n):
            for j in range(0,n):
                if i!=j and nums[i] + nums[j] == t:
                    return [i,j]
        return [-1,-1]

        
