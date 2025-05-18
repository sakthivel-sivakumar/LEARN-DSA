class Solution:
    def majorityElement(self, arr: List[int]) -> List[int]:
        c1,c2 = 0,0
        e1,e2 = float("inf"),float("inf")

        for i in arr:
            if c1 == 0 and i != e2:
                c1 = 1
                e1 = i
            elif c2 == 0 and i != e1:
                c2 = 1
                e2 = i
            elif e1 == i:
                c1+=1
            elif e2 == i:
                c2+=1
            else:
                c1-=1
                c2-=1

        result = []
        if arr.count(e1) > len(arr) // 3:
            result.append(e1)
        if arr.count(e2) > len(arr) // 3:
            result.append(e2)
        return result
        '''
        n = len(arr)
        limit = n//3

        freqmap = {}
        res = []

        for i in arr:
            freqmap[i] = freqmap.get(i,0)+1
        
        print(freqmap)

        for k,v in freqmap.items():
            if v>limit:
                res.append(k)
        
        return res
        '''