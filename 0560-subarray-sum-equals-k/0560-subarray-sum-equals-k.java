class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i:nums)
        {
            prefixSum += i;
            int t = prefixSum - k;
            if(map.containsKey(t)){
                count += map.get(t);
            }
            map.put(prefixSum , map.getOrDefault(prefixSum,0) + 1);
        }

        return count;
        
    }
}