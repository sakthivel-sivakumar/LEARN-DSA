class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            
        }
        for(int i:hm.keySet())
            if(hm.get(i) == 1)
                res += i;
        return res;
    }
}