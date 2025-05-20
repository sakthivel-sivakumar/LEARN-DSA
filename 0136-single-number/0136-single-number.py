class Solution:
    def singleNumber(self, arr: List[int]) -> int:

        for i in arr:
            if arr.count(i)==1:
                return i
        