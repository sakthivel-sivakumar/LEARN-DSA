class Solution:
    def majorityElement(self, arr: List[int]) -> int:
        '''
        freq_map = {}
        for i in arr:
            if i in freq_map:
                freq_map[i]=freq_map[i]+1
            else:
                freq_map[i] = 1
        
        max_freq = max(freq_map.values())

        for i in freq_map:
            if freq_map[i] == max_freq:
                return i
        '''
        '''
        arr.sort() # O(N log N)
        return arr[len(arr)//2] # O(1)
        '''
        c = 0
        e = 0
        for i in arr:
            if c == 0:
                c = 1
                e = i
            elif e == i:
                c+=1
            else:
                c-=1
        return e













        